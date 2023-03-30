package DataTypes.exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            char alphabet = scanner.nextLine().charAt(0);
            sum += alphabet;
        }
        System.out.println("The sum equals: " +sum);
    }
}
