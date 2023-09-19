package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Greet.main(args);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, " + Greet.getName() + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        final int startDiapason = 1;
        final int randIntDiapason = 100;
        Random random = new Random();

        while (correctAnswers < roundsToWin) {
            int number = random.nextInt(startDiapason, randIntDiapason);
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
                System.out.println("Let's try again, " + Greet.getName() + "!");
                break;
            }
        }

        if (correctAnswers == roundsToWin) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        }
        scanner.close();
    }
}
