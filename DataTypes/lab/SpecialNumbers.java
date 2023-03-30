package DataTypes.lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = 0;
        int firstDigit = 0;
        boolean isSpecial = false;

        for (int i = 1; i <= number; i++) {
            firstDigit = i;
            while(i > 0){
                lastDigit += i % 10;
                i = i / 10;
            }
            isSpecial = (lastDigit == 5) || (lastDigit == 7) || (lastDigit == 11);
            if(isSpecial){
                System.out.printf("%d -> True%n", firstDigit);
            }else{
                System.out.printf("%d -> False%n", firstDigit);
            }
//            System.out.printf("%d -> %b%n", firstDigit, isSpecial);
            lastDigit = 0;
            i = firstDigit;


        }
    }
}
