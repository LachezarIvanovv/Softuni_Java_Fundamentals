package Methods.exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

         numberMatrix(number);
    }

    private static void numberMatrix(int number) {
        for (int columns = 1; columns <= number; columns++) {
            for (int lines = 1; lines <= number; lines++) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}
