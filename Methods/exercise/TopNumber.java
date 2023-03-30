package Methods.exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        findTopNumber(number);
    }

    private static void findTopNumber(int number) {
        for (int i = 1; i <= number; i++) {
            int wholeDigit = i;
            int secondDigit = wholeDigit % 10;
            wholeDigit /= 10;
            int thirdDigit = wholeDigit % 10;
            wholeDigit /= 10;
            if((secondDigit + wholeDigit + thirdDigit) % 8 == 0 && (secondDigit % 2 != 0 || wholeDigit % 2 != 0 || thirdDigit % 2 != 0)){
                System.out.println(i);
            }
        }
    }
}
