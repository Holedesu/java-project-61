package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        Random randomNum1 = new Random();
        Random randomNum2 = new Random();

        while (correctAnswers < roundsToWin) {
            int number1 = randomNum1.nextInt(30) + 30;
            int number2 = randomNum2.nextInt(30);
            int gcd = findGCD(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == gcd) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }

        }
    }
    private static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;

    }
}
