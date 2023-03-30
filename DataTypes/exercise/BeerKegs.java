package DataTypes.exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        String maxModel = "";
        double maxRadius = 0;
        int maxHeight = 0;

        for (int i = 1; i <= number; i++) {
            String model= scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double total = Math.PI * Math.pow(radius, 2) * height;
            if(total > sum){
                sum = total;
                maxModel = model;
                maxRadius = radius;
                maxHeight = height;
            }
        }
        System.out.println(maxModel);
    }
}
