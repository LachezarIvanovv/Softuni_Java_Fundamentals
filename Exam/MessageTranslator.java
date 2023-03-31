package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());



        for(int i = 0; i < count; i++){
            String input = scanner.nextLine();
            String regex = "([!])(?<command>[A-Z][a-z]{2,})(\\1):\\[(?<string>[A-za-z]{7,})\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            boolean isFound = matcher.find();

            while(isFound) {
                String matchedCommand = matcher.group("command");
                String matchedString = matcher.group("string");

                System.out.print(matchedCommand + ": ");
                for (int k = 0; k < matchedString.length(); k++) {
                    char currentChar = matchedString.charAt(k);
                    int ascii = (int) currentChar;
                        System.out.print(ascii);
                        if(k == matchedString.length() - 1){
                            break;
                        }else{
                            System.out.print(" ");
                        }
                }
                System.out.println();
                break;
            }
            if(!isFound){
                System.out.println("The message is invalid");
            }
        }
    }
}
