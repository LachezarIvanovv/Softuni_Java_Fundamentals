package Methods.exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

       vowelsCountInSingleWord(input);
    }
    private static void vowelsCountInSingleWord(String input) {
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentWord = input.charAt(i);
            switch (currentWord){
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                    countVowels++;
                    break;
            }
        }
        System.out.println(countVowels);
    }
}
