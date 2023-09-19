package hexlet.code;

import java.util.Scanner;
import java.util.Random;
public class Calculator {
    public static void main(String[] args) {

        Greet.main(args);
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        Random random = new Random();

        while (correctAnswers < roundsToWin) {
            int startDiapason = 1;
            final int randIntDiapason = 30;
            int number1 = random.nextInt(startDiapason, randIntDiapason);
            int number2 = random.nextInt(startDiapason, randIntDiapason);
            char operator = getRandomOperator();

            int expectedAnswer = calculateExpression(number1, number2, operator);

            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == expectedAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + expectedAnswer + "'.");
                System.out.println("Let's try again, " + Greet.getName() + "!");
                break;
            }

            scanner.nextLine();
        }

        if (correctAnswers == roundsToWin) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        }
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        Random random = new Random();
        int index = random.nextInt(operators.length);
        return operators[index];
    }

    private static int calculateExpression(int number1, int number2, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                result = 0;
                break;
        }

        return result;
    }
}
