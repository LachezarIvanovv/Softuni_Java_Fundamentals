package Methods.lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(sum(number));
    }

    private static int sum(int number) {
        oddSum(number);
        evenSum(number);
        return oddSum(number) * evenSum(number);
    }

    private static int evenSum(int number) {
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            if(digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    private static int oddSum(int number) {
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
