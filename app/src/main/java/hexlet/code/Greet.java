package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String name = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }

    public static String getName() {
        return name;
    }
}
