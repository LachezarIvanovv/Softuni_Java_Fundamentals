package MidExamPreparation.exam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());
        int countForFlour = 0;


        double totalPriceOfFlour = priceOfFlour * students;
        double totalPriceOfEggs = priceOfEgg * 10 * students;
        double totalPriceOfApron = priceOfApron * Math.ceil(students + students * 0.2);
        for (int i = 1; i < students; i++) {
            if (i % 5 == 0) {
                countForFlour++;
            }
        }
        if(countForFlour != 0) {
            totalPriceOfFlour = totalPriceOfFlour - (countForFlour * priceOfFlour);
        }
        double sum = totalPriceOfFlour + totalPriceOfEggs + totalPriceOfApron;

        if(budget > sum){
            System.out.printf("Items purchased for %.2f$.", sum);
        }else{
            System.out.printf("%.2f$ more needed.", sum - budget);
        }
    }
}
