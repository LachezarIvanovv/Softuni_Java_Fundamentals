package basicSyntax.lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startPoint = Integer.parseInt(scanner.nextLine());

        for (int i = startPoint; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);
        }
        int result = number * startPoint;
        if(startPoint > 10){
            System.out.printf("%d X %d = %d%n", number, startPoint, result);
        }
    }
}
