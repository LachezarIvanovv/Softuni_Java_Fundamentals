package basicSyntax.exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        int d2 = 0;
        int c3 = 0;
        double totalSum = 0.0;

        for (int i = 0; i < countOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            p1 += pricePerCapsule;
            d2 += days;
            c3 += countCapsules;
            double total = p1 * d2 * c3;
            System.out.printf("The price for the coffee is: $%.2f%n", total);
            totalSum += total;
            total = 0;
            p1 = 0;
            d2 = 0;
            c3 = 0;
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
