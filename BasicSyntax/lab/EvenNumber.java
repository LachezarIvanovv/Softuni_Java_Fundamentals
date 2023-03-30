package basicSyntax.lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i % 2 == 0 || i % 2 != 0; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number % 2 == 0){
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            }else{
                System.out.printf("Please write an even number.%n");
            }
        }
    }
}
