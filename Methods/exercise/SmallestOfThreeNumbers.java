package Methods.exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = smallestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(result);
    }

    private static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
