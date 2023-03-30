package AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> countChars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if(currentSymbol == ' '){
                continue;
            }
            if(!countChars.containsKey(currentSymbol)){
                countChars.put(currentSymbol, 1);
            }else{
                countChars.put(currentSymbol, countChars.get(currentSymbol) + 1);
            }
        }
        countChars.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
