package Methods.lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= number; line++) {
            printingTriangle(1, line);
        }
        for (int line = number - 1; line >= 1; line--) {
            printingTriangle(1, line);
        }
    }
    public static void printingTriangle(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
