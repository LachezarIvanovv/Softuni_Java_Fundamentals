package Methods.lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (action){
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }

    }
    public static void add(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);
    }
    public static void subtract(int firstNumber, int secondNumber){
        System.out.println(firstNumber - secondNumber);
    }
    public static void multiply(int firstNumber, int secondNumber){
        System.out.println(firstNumber * secondNumber);
    }
    public static void divide(int firstNumber, int secondNumber){
        System.out.println(firstNumber / secondNumber);
    }
}
