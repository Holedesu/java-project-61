package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static int startDiapason = 1;

    private static int missingNumber;
    public static void main(String[] args) {
        Greet.main(args);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello, " + Greet.getName() + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;
        final int roundsToWin = 3;
        final int randIntDiapason1 = 100;
        final int randIntDiapason2 = 10;
        Random random = new Random();
        while (correctAnswers < roundsToWin) {
            int number = random.nextInt(startDiapason, randIntDiapason1);
            int step = random.nextInt(startDiapason, randIntDiapason2);

            int[] progression = generateProgression(number, step);
            System.out.print("Question: ");
            for (int i : progression) {
                if (i == 0) {
                    System.out.print(".. ");

                } else {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == getMissingNum(progression)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + getMissingNum(progression) + "'.");
                System.out.println("Let's try again, " + Greet.getName() + "!");
                break;

            }
        }
        if (correctAnswers == roundsToWin) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        }
    }

    private static int[] generateProgression(int number, int step) {
        final int arraySize = 10;
        int[] progression = new int[arraySize];
        Random random = new Random();
        int randomInt = random.nextInt(startDiapason, arraySize);

        for (int i = 0; i < progression.length; i++) {
            if (i == randomInt) {
                missingNumber = number;
                number += step;
            } else {
                progression[i] = number;
                number += step;
            }
        }
        return progression;
    }

    private static int getMissingNum(int[] progression) {
        return missingNumber;
    }
}
