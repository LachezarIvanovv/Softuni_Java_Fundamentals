package Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = mathPow(number, power);

        System.out.println(new DecimalFormat("0.####").format(mathPow(number,power)));

    }
    private static double mathPow(double number, int power) {
        double result = 1;
        result = Math.pow(number, power);
        return result;
    }
}
