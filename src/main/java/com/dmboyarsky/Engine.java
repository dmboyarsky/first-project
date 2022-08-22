package com.dmboyarsky;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    private static final int LINE_OF_QUESTIONS = 0;
    private static final int LINE_OF_ANSWERS = 1;

    public static void run(final String rules,
                           final String[][] questionsAndAnswers) {
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?
                """);
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("\nHello, " + playerName + "!\n");
        System.out.println(rules + "\n");
        for (int i = 0; i < ROUNDS; i++) {
            String question = questionsAndAnswers[LINE_OF_QUESTIONS][i];
            String answer = questionsAndAnswers[LINE_OF_ANSWERS][i];
            System.out.println("Question: " + question);
            String playerAnswer = getAnswer();
            if (!answer.equals(playerAnswer)) {
                System.out.println("\n" + "'" + playerAnswer
                        + "' is wrong answer. Correct answer was '"
                        + answer + "'.\nLet's try again, "
                        + playerName + "!");
                return;
            }
            System.out.println("Correct!\n");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

    private static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

}
