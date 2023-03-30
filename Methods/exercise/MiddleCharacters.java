package Methods.exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleCharacter(input);
    }

    private static void middleCharacter(String input) {
        if (input.length() % 2 == 1) {
            int currentPosition = input.length() / 2;
            char currentSymbol = input.charAt(currentPosition);
            System.out.println(currentSymbol);
        } else {
            int currentPosition = input.length() / 2;
            char firstSymbol = input.charAt(currentPosition - 1);
            char secondSymbol = input.charAt(currentPosition);
            System.out.printf("%c%c", firstSymbol, secondSymbol);
        }
    }

}
