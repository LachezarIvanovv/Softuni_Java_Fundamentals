package MidExamPreparation.exam;

import java.util.Scanner;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());

        double totalPriceOfFlour = priceOfFlour * students;
        double totalPriceOfEggs = priceOfEgg * 10 * students;
        double totalPriceOfApron = priceOfApron * Math.ceil(students + students * 0.2);

        double flourDiscount = Math.floor(students * 1.0 / 5);
        if(flourDiscount != 0){
            totalPriceOfFlour -= (flourDiscount * priceOfFlour);
        }
        double sum = totalPriceOfFlour + totalPriceOfEggs + totalPriceOfApron;

        if(sum <= budget){
            System.out.printf("Items purchased for %.2f$.", sum);
        }else{
            System.out.printf("%.2f$ more needed.", sum - budget);
        }
    }
}
