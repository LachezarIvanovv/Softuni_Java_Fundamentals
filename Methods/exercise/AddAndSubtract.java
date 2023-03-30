package Methods.exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        int sum = sumFirstAndSecondDigit(firstDigit,secondDigit);
        int sumAndSub = subtractThirdDigitFromSum(firstDigit,secondDigit,thirdDigit);

        System.out.println(sumAndSub);
    }

    private static int subtractThirdDigitFromSum(int firstDigit, int secondDigit, int thirdDigit) {
        int sumAndSub = (firstDigit + secondDigit) - thirdDigit;
        return sumAndSub;
    }

    private static int sumFirstAndSecondDigit(int firstDigit, int secondDigit) {
        int sum = firstDigit + secondDigit;
        return sum;
    }
}
