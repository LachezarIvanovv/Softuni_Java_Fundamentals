package RegularExpressions.lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        String input = scanner.nextLine();
        Matcher phoneMatcher = pattern.matcher(input);
        List<String> matchedPhoneNumbers = new LinkedList<>();

        while(phoneMatcher.find()){

            matchedPhoneNumbers.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedPhoneNumbers));
    }
}
