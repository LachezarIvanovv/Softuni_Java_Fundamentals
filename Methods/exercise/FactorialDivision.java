package Methods.exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Integer.parseInt(scanner.nextLine());
        double second = Integer.parseInt(scanner.nextLine());

        double resultOfFirst = factorialFirst(first);
        double resultOfSecond = factorialSecond(second);
        double total =  resultOfFirst / resultOfSecond;

        System.out.printf("%.2f", total);

    }


    private static double factorialFirst(double first) {
        double firstFactorial = 1;
        for (int i = 1; i <= first; i++) {
            firstFactorial *= i;
        }
        return firstFactorial;
    }

    private static double factorialSecond(double second) {
        double secondFactorial = 1;
        for (int i = 1; i <= second; i++) {
            secondFactorial *= i;
        }
        return secondFactorial;
    }
}
