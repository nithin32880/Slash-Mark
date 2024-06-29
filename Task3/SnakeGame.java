package Task3;
import javax.swing.JFrame;

public class SnakeGame extends JFrame {
    public SnakeGame() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        setTitle("Snake Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JFrame frame = new SnakeGame();
        frame.setVisible(true);
    }
}
