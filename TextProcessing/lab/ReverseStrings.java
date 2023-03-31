package TextProcessing.lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedString = "";
        String line = "";
        int counter = 0;

        while (!input.equals("end")) {
            line += input;
            line += " ";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversedString += input.charAt(i);
            }
            reversedString += " ";
            counter++;
            input = scanner.nextLine();
        }
        String[] reversedStringArray = reversedString.split(" ");
        String[] lineArray = line.split(" ");

        for (int i = 0; i < counter; i++) {
            System.out.printf("%s = %s%n", lineArray[i],reversedStringArray[i]);
        }
    }
}
