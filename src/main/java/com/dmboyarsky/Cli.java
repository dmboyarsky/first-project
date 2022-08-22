package com.dmboyarsky;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?
                """);
        String name = scanner.nextLine();
        System.out.println("\nHello, " + name + "!");
    }
}
