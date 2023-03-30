package Methods.exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean passwordLength = passwordLength(input);
        boolean passwordValidation = passwordValidation(input);
        boolean passwordDigits = passwordDigits(input);
//        •	6 – 10 characters (inclusive);
        if (!passwordLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
//        •	Consists only of letters and digits;
        if (!passwordValidation) {
            System.out.println("Password must consist only of letters and digits");
        }
//        •	Have at least 2 digits.
        if (!passwordDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if(passwordLength && passwordValidation && passwordDigits){
            System.out.println("Password is valid");
        }

    }

    static boolean passwordLength(String input) {
        return (input.length() >= 6 && input.length() <= 10);
    }

    static boolean passwordValidation(String input) {
        for (int index = 0; index < input.length(); index++) {
        boolean isSmallLetters = (input.charAt(index) >= 97 && input.charAt(index) <= 122);
        boolean isCapitalLetters = (input.charAt(index) >= 65 && input.charAt(index) <= 90);
        boolean isDigit = (input.charAt(index) >= 48 && input.charAt(index) <= 57);
            if(!isSmallLetters && !isCapitalLetters && !isDigit){
                return false;
            }
        }
        return true;
    }

    static boolean passwordDigits(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
                count++;
            }
        }
        return count >= 2;
    }

}
