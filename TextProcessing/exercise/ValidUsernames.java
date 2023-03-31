package TextProcessing.exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();
        boolean isValid = false;

        for (String username : input) {
            if(username.length() >= 3 && username.length() <= 16){
                int counter = 0;
                for (int i = 0; i < username.length(); i++) {
                    char symbol = username.charAt(i);
                    if(Character.isAlphabetic(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95){
                        sb.append(symbol);
                        counter++;
                    }else{
                        break;
                    }
                    if(counter == username.length()){
                        isValid = true;
                    }
                }
            }
            if(sb.length() == username.length()) {
                System.out.println(sb);
            }
            sb.setLength(0);
        }

    }
}
