import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Alphabets");
            System.out.println("2. Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    alphabetMenu(sc);
                    break;
                case 2:
                    numberMenu(sc);
                    break;
                case 3:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }

    // Alphabet menu
    private static void alphabetMenu(Scanner sc) {
        System.out.println("\n--- Alphabet Menu ---");
        System.out.println("1. Single Alphabet Pattern");
        System.out.println("2. Range of Alphabets Pattern");
        System.out.println("3. Fixed Name Pattern");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter a single alphabet: ");
                char c = sc.next().charAt(0);
                printStarPattern(Character.toString(c));
                break;
            case 2:
                System.out.print("Enter starting alphabet: ");
                char start = sc.next().charAt(0);
                System.out.print("Enter ending alphabet: ");
                char end = sc.next().charAt(0);
                for (char i = start; i <= end; i++) {
                    printStarPattern(Character.toString(i));
                }
                break;
            case 3:
                System.out.print("Enter your name: ");
                String name = sc.next();
                for (int i = 0; i < 4; i++) {
                    printStarPattern(name);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Number menu
    private static void numberMenu(Scanner sc) {
        System.out.println("\n--- Number Menu ---");
        System.out.println("1. Single Number Pattern");
        System.out.println("2. Range of Numbers Pattern");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                printStarPattern(Integer.toString(num));
                break;
            case 2:
                System.out.print("Enter starting number: ");
                int start = sc.nextInt();
                System.out.print("Enter ending number: ");
                int end = sc.nextInt();
                for (int i = start; i <= end; i++) {
                    printStarPattern(Integer.toString(i));
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Function to print star pattern
    private static void printStarPattern(String value) {
        int n = 5; // fixed height

        System.out.println("\nPattern for: " + value);
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
