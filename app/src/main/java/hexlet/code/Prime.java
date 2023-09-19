package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Greet.main(args);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + Greet.getName() + "!");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        Random random = new Random();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (correctAnswers < roundsToWin) {
            int startDiapason = 1;
            int randIntDiapason = 100;
            int number1 = random.nextInt(startDiapason, randIntDiapason);

            System.out.println("Question: " + number1);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            boolean isPrime = isPrime(number1);
            if (answer.equals("yes")) {
                if (isPrime) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Greet.getName() + "!");
                    break;
                }
            } else if (answer.equals("no")) {
                if (!isPrime) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Greet.getName() + "!");
                    break;
                }
            }
        }
        if (correctAnswers == roundsToWin) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
