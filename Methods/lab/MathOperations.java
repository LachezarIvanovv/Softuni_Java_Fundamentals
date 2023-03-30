package Methods.lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double result = 0;
        
        switch (operator){
            case "+":
                result += resultOfAdd(firstNumber,secondNumber,operator);
                break;
            case "-":
                result += resultOfSubtraction(firstNumber,secondNumber,operator);
                break;
            case "*":
                result += resultOfMultiplication(firstNumber,secondNumber,operator);
                break;
            case "/":
                result += resultOfDivision(firstNumber,secondNumber,operator);
                break;
        }
        System.out.printf("%.0f", result);
    }

    private static double resultOfDivision(int firstNumber, int secondNumber, String operator) {
        double result = firstNumber * 1.0 / secondNumber;
        return result;
    }

    private static int resultOfMultiplication(int firstNumber, int secondNumber, String operator) {
        int result = firstNumber * secondNumber;
        return result;
    }

    private static int resultOfSubtraction(int firstNumber, int secondNumber, String operator) {
        int result = firstNumber - secondNumber;
        return result;
    }

    private static double resultOfAdd(int firstNumber, int secondNumber, String operator) {
        int result = firstNumber + secondNumber;
        return result;
    }

}
