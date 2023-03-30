package DataTypes.lab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double metresInKilometres = number / 1000.0;

        System.out.printf("%.2f", metresInKilometres);
    }
}
