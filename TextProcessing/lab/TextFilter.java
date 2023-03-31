package TextProcessing.lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        String replacedText = "";

        for(String bannedWord : bannedWords){
            if(text.contains(bannedWord)) {
                String wordWithStars = textToWordWithStars(bannedWord);
                text = text.replace(bannedWord, wordWithStars);
            }
        }
        System.out.println(text);
    }

    private static String textToWordWithStars(String bannedWords) {
        StringBuilder wordWithStars = new StringBuilder();
        for (int i = 0; i < bannedWords.length(); i++) {
            wordWithStars.append("*");
        }
        return wordWithStars.toString();
    }
}
