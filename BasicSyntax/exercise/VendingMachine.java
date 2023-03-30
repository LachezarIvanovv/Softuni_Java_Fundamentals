package basicSyntax.exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoney = 0;
        double price = 0;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if(coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                totalMoney += coins;
            }else{
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!input.equals("End")){
            switch (input){
                case "Nuts":
                    price += 2.0;
                    if(totalMoney >= price){
                        totalMoney -= price;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price += 0.7;
                    if(totalMoney >= price){
                        totalMoney -= price;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price += 1.5;
                    if(totalMoney >= price){
                        totalMoney -= price;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price += 0.8;
                    if(totalMoney >= price){
                        totalMoney -= price;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price += 1.0;
                    if(totalMoney >= price){
                        totalMoney -= price;
                        System.out.printf("Purchased %s%n", input);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            price = 0;
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
