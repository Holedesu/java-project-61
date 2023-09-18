package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        Random random = new Random();

        while (correctAnswers < roundsToWin) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            boolean isCorrect = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrect) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer
                        + "' is wrong answer ;(. Correct answer was '"
                        + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (correctAnswers == roundsToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
        scanner.close();
    }
}
