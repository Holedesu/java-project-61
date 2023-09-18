package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String num = scanner.nextLine();
        switch (num) {
            case "1" -> Greet.main(args);
            case "2" -> Even.main(args);
            case "0" -> System.exit(0);
            default -> System.out.println("Invalid number");
        }
        scanner.close();
    }
}
