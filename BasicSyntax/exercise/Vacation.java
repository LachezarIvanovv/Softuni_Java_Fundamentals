package basicSyntax.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (typeOfPeople) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                    if(groupOfPeople >= 100){
                        groupOfPeople -= 10;
                    }
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                    if(groupOfPeople >= 100){
                        groupOfPeople -= 10;
                    }
                } else if (day.equals("Sunday")) {
                    price = 16;
                    if(groupOfPeople >= 100){
                        groupOfPeople -= 10;
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                break;
        }
        double totalPrice = groupOfPeople * price;
        if(typeOfPeople.equals("Students")){
            if(groupOfPeople >= 30){
                totalPrice = totalPrice * 0.85;
            }
        }else if(typeOfPeople.equals("Regular")){
            if(groupOfPeople >= 10 && groupOfPeople <= 20){
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}



