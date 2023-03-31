package RegularExpressions.lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})");
        String input = scanner.nextLine();
        Matcher dateMatcher = pattern.matcher(input);
        List<String> matchedDate = new LinkedList<>();

        while(dateMatcher.find()){
            String day = dateMatcher.group("day");
            String month = dateMatcher.group("month");
            String year = dateMatcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day,month,year);
        }
    }
}
