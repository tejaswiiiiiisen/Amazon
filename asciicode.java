import java.util.*;

public class asciicode {
   
    static Map<Character, String[]> font = new HashMap<>();

    public static void main(String[] args) {
        initFont();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Alphabets");
            System.out.println("2. Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = safeNextInt(sc);

            switch (choice) {
                case 1:
                    alphabetMenu(sc);
                    break;
                case 2:
                    numberMenu(sc);
                    break;
                case 3:
                    System.out.println("Exiting program....");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }

   
private static void alphabetMenu(Scanner sc) {
    System.out.println("\n--- Alphabet Menu ---");
    System.out.println("1. Single Alphabet");
    System.out.println("2. Range of Alphabets ");
    System.out.println("3. Print ALL Alphabets ");
    System.out.println("4. Add Name ");
    System.out.print("Enter your choice: ");
    int ch = safeNextInt(sc);

    switch (ch) {
        case 1:
            System.out.print("Enter a single alphabet: ");
            char c = sc.next().charAt(0);
            System.out.println("\nPattern for: " + Character.toUpperCase(c));
            printCombined(String.valueOf(c));
            break;
        case 2:
            System.out.print("Enter starting alphabet: ");
            char start = sc.next().charAt(0);
            System.out.print("Enter ending alphabet: ");
            char end = sc.next().charAt(0);
            start = Character.toUpperCase(start);
            end = Character.toUpperCase(end);
            if (start > end) { char t = start; start = end; end = t; }
            for (char x = start; x <= end; x++) {
                System.out.println("\nPattern for: " + x);
                printCombined(String.valueOf(x));
            }
            break;
        case 3:
            for (char x = 'A'; x <= 'Z'; x++) {
                System.out.println("\nPattern for: " + x);
                printCombined(String.valueOf(x));
            }
            break;
        case 4:
            System.out.print("Enter your name: ");
            sc.nextLine(); 
            String name = sc.nextLine();
            System.out.println("\nPattern for: " + name.toUpperCase());
            printCombined(name);
            break;
        default:
            System.out.println("Invalid choice!");
    }
}


  
    private static void numberMenu(Scanner sc) {
        System.out.println("\n--- Number Menu ---");
        System.out.println("1. Single Number ");
        System.out.println("2. Range of Numbers");
        System.out.println("3. Print 1 to 100");
        System.out.print("Enter your choice: ");
        int ch = safeNextInt(sc);

        switch (ch) {
            case 1:
                System.out.print("Enter a number: ");
                int num = safeNextInt(sc);
                System.out.println("\nPattern for: " + num);
                printCombined(Integer.toString(num));
                break;
            case 2:
                System.out.print("Enter starting number: ");
                int s = safeNextInt(sc);
                System.out.print("Enter ending number: ");
                int e = safeNextInt(sc);
                if (s > e) { int t = s; s = e; e = t; }
                for (int i = s; i <= e; i++) {
                    System.out.println("\nPattern for: " + i);
                    printCombined(Integer.toString(i));
                }
                break;
            case 3:
                for (int i = 1; i <= 100; i++) {
                    System.out.println("\nPattern for: " + i);
                    printCombined(Integer.toString(i));
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

   
    private static void printCombined(String s) {
        s = s.toUpperCase();
        final int H = 7; 
        String[] out = new String[H];
        for (int r = 0; r < H; r++) out[r] = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String[] pat = font.get(ch);
            if (pat == null) {
              
                pat = new String[] {"     ","     ","     ","     ","     ","     ","     "};
            }
            for (int r = 0; r < H; r++) {
                out[r] += pat[r] + "  "; 
            }
        }
       
        for (int r = 0; r < H; r++) {
            System.out.println(out[r]);
        }
    }

    
    private static void initFont() {
        // A
        font.put('A', new String[]{
            "  * ",
            " * *",
            "*   *",
            "*****",
            "*   *",
            "*   *",
            "*   *"
        });
        font.put('B', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*   *",
            "*   *",
            "**** "
        });
        font.put('C', new String[]{
            " ****",
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            " ****"
        });
        font.put('D', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "**** "
        });
        font.put('E', new String[]{
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "*    ",
            "*    ",
            "*****"
        });
        font.put('F', new String[]{
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });
        font.put('G', new String[]{
            " ****",
            "*    ",
            "*    ",
            "*  **",
            "*   *",
            "*   *",
            " ****"
        });
        font.put('H', new String[]{
            "*   *",
            "*   *",
            "*   *",
            "*****",
            "*   *",
            "*   *",
            "*   *"
        });
        font.put('I', new String[]{
            "*****",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"
        });
        font.put('J', new String[]{
            "  ***",
            "   * ",
            "   * ",
            "   * ",
            "*  * ",
            "*  * ",
            " **  "
        });
        font.put('K', new String[]{
            "*   *",
            "*  * ",
            "* *  ",
            "**   ",
            "* *  ",
            "*  * ",
            "*   *"
        });
        font.put('L', new String[]{
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*****"
        });
        font.put('M', new String[]{
            "*   *",
            "** **",
            "* * *",
            "*   *",
            "*   *",
            "*   *",
            "*   *"
        });
        font.put('N', new String[]{
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *",
            "*   *",
            "*   *"
        });
        font.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        font.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });
        font.put('Q', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "* * *",
            "*  * ",
            " ** *"
        });
        font.put('R', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "* *  ",
            "*  * ",
            "*   *"
        });
        font.put('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });
        font.put('T', new String[]{
            "*****",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  "
        });
        font.put('U', new String[]{
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        font.put('V', new String[]{
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " * * ",
            " * * ",
            "  *  "
        });
        font.put('W', new String[]{
            "*   *",
            "*   *",
            "*   *",
            "* * *",
            "* * *",
            "** **",
            "*   *"
        });
        font.put('X', new String[]{
            "*   *",
            " * * ",
            "  *  ",
            "  *  ",
            "  *  ",
            " * * ",
            "*   *"
        });
        font.put('Y', new String[]{
            "*   *",
            " * * ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  "
        });
        font.put('Z', new String[]{
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****"
        });

        // digits 0-9
        font.put('0', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        font.put('1', new String[]{
            "  *  ",
            " **  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"
        });
        font.put('2', new String[]{
            " *** ",
            "*   *",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*****"
        });
        font.put('3', new String[]{
            " *** ",
            "*   *",
            "    *",
            "  ** ",
            "    *",
            "*   *",
            " *** "
        });
        font.put('4', new String[]{
            "   * ",
            "  ** ",
            " * * ",
            "*  * ",
            "*****",
            "   * ",
            "   * "
        });
        font.put('5', new String[]{
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "    *",
            "*   *",
            " *** "
        });
        font.put('6', new String[]{
            " *** ",
            "*    ",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** "
        });
        font.put('7', new String[]{
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*    "
        });
        font.put('8', new String[]{
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** "
        });
        font.put('9', new String[]{
            " *** ",
            "*   *",
            "*   *",
            " ****",
            "    *",
            "    *",
            " *** "
        });

       
        font.put(' ', new String[]{
            "     ","     ","     ","     ","     ","     ","     "
        });
    }

   
    private static int safeNextInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Please enter a valid integer: ");
        }
        return sc.nextInt();
    }
}
