package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean isFound = matcher.find();
        List<String> validPairs = new ArrayList<>();
        int countValidPair = 0;

        while(isFound){
            countValidPair++;
            String matchedWord = matcher.group("word");
            String reversedWord = new StringBuilder(matcher.group("mirror")).reverse().toString();

            if(matchedWord.equals(reversedWord)){
                validPairs.add(matchedWord + " <=> " + matcher.group("mirror"));
            }

             isFound = matcher.find();
        }
        if(countValidPair == 0){
            System.out.println("No word pairs found!");
        }else{
            System.out.printf("%d word pairs found!%n", countValidPair);
        }
        if(validPairs.isEmpty()){
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            System.out.printf(String.join(", ", validPairs));
        }
    }
}
