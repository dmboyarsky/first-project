package com.dmboyarsky;

import com.dmboyarsky.games.Even;
import com.dmboyarsky.games.Calc;
import com.dmboyarsky.games.GCD;
import com.dmboyarsky.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printGames();
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("\nYour choice: " + choice + "\n");
        switch (choice) {
            case "1" -> Cli.greeting();
            case "2" -> Even.run();
            case "3" -> Calc.run();
            case "4" -> GCD.run();
            case "5" -> Progression.run();
            case "6" -> System.out.println("6 - Prime");
            case "0" -> System.out.println("See you again!");
            default -> System.out.println("Your choice is incorrect, please try again!");
        }
    }

    private static void printGames() {
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
    }
}
