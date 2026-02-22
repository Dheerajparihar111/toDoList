import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoManager manager = new TodoManager();
        int choice;

        do {
            System.out.println("=============================");
            System.out.println("| TO-DO LIST MENU           |");
            System.out.println("| 1) Add Task               |");
            System.out.println("| 2) View Tasks             |");
            System.out.println("| 3) Mark Task as Completed |");
            System.out.println("| 4) Delete Task            |");
            System.out.println("| 5) Exit                   |");
            System.out.println("=============================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task number to mark complete: ");
                    int completeIndex = scanner.nextInt() - 1;
                    manager.markTaskCompleted(completeIndex);
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    manager.deleteTask(deleteIndex);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}