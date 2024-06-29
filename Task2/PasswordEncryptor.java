package Task2;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class PasswordEncryptor {
    private static final String ALGORITHM = "AES";

    public static String encrypt(String password, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedPasswordBytes = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedPasswordBytes);
    }

    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(256);
        return keyGen.generateKey();
    }

    public static void main(String[] args) {
        try {
            SecretKey key = generateKey();
            String password = PasswordGenerator.generatePassword();
            String encryptedPassword = encrypt(password, key);

            System.out.println("Generated Password: " + password);
            System.out.println("Encrypted Password: " + encryptedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
