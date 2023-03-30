package Methods.exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        asciiCharactersInRange(start, end);
    }

    private static void asciiCharactersInRange(char start, char end) {
        if (start < end) {
            for (int ascii = start + 1; ascii < end; ascii++) {
                System.out.print((char) ascii + " ");
            }
        } else {
            for (int ascii = end + 1; ascii < start; ascii++) {
                System.out.print((char) ascii + " ");
            }
        }
    }
}
