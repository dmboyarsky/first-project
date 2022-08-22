package com.dmboyarsky.games;

import com.dmboyarsky.Engine;
import com.dmboyarsky.Utils;

public class GCD {

    private static final String CONDITION_GAME =
            "Find the greatest common divisor of given numbers.";

    public static void run() {
        final int maxNumbers = 100;
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(0, maxNumbers);
            int secondNumber = Utils.getRandomNumber(0, maxNumbers);
            questions[i] = firstNumber + " " + secondNumber;
            answers[i] = findGcd(firstNumber, secondNumber);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static String findGcd(final int firstNumber,
                                  final int secondNumber) {
        int number = firstNumber;
        int difference = Math.max(number, secondNumber)
                - Math.min(number, secondNumber);
        int minNumber = Math.min(number, secondNumber);
        if (minNumber == 0) {
            return String.valueOf(difference);
        } else {
            while (difference != minNumber) {
                number = difference;
                difference = Math.max(difference, minNumber)
                        - Math.min(difference, minNumber);
                minNumber = Math.min(number, minNumber);
            }
            return String.valueOf(minNumber);
        }
    }

}
