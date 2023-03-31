package RegularExpressions.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);
        boolean foundSomething = matcher.find();

        while(foundSomething){
            System.out.print(matcher.group() + " ");

            foundSomething = matcher.find();
        }

    }
}
