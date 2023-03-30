package Methods.lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (order){
            case "coffee":
                coffee(order,quantity);
                break;
            case "water":
                water(order,quantity);
                break;
            case "coke":
                coke(order,quantity);
                break;
            case "snacks":
                snacks(order,quantity);
                break;
        }

    }
    public static void coffee(String order, int quantity){
        double price = 1.50;
        double sum = price * quantity;
        System.out.printf("%.2f", sum);
    }
    public static void water(String order, int quantity){
        double price = 1.00;
        double sum = price * quantity;
        System.out.printf("%.2f", sum);
    }
    public static void coke(String order, int quantity){
        double price = 1.40;
        double sum = price * quantity;
        System.out.printf("%.2f", sum);
    }
    public static void snacks(String order, int quantity){
        double price = 2.00;
        double sum = price * quantity;
        System.out.printf("%.2f", sum);
    }
}
