package Task1;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        boolean running = true;

        while (running) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    taskList.removeTask(taskNumber - 1);
                    break;
                case 3:
                    taskList.listTasks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
