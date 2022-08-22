package com.dmboyarsky.games;

import com.dmboyarsky.Engine;
import com.dmboyarsky.Utils;

public class Progression {

    private static final String CONDITION_GAME =
            "What number is missing in the progression?";
    private static final int MAX_PROGRESSION_LENGTH = 6;
    private static final int MIX_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_STEP = 51;
    private static final int MIX_PROGRESSION_STEP = -25;

    public static void run() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = Utils.getRandomNumber(
                    MIX_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH
            );

            int progressionStep = Utils.getRandomNumber(
                            MIX_PROGRESSION_STEP, MAX_PROGRESSION_STEP
            );

            int progressionElement = Utils.getRandomNumber(
                    Utils.MIN, Utils.MAX
            );

            int answerIndex = Utils.getRandomNumber(
                    0, progressionLength - 1
            );

            int[] progression = buildProgression(
                            progressionLength,
                            progressionStep,
                            progressionElement
            );

            questions[i] = makeQuestion(progression, answerIndex);
            answers[i] = String.valueOf(progression[answerIndex]);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static int[] buildProgression(final int progressionLength,
                                          final int progressionStep,
                                          final int progressionElement) {
        int element = progressionElement;
        int[] progression = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = element;
            element += progressionStep;
        }
        return progression;
    }

    private static String makeQuestion(final int[] progression,
                                       final int answerPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == answerPosition) {
                stringBuilder.append(".. ");
            } else {
                stringBuilder.append(progression[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
