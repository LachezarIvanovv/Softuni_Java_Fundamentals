package basicSyntax.exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSabers = Double.parseDouble(scanner.nextLine()); //* Math.ceil(countStudents + 0.1));
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        int countBelts = 0;
        int belts = 0;

        for (int i = 1; i <= countStudents; i++) {
            countBelts++;
            if(countBelts == 6){
                countBelts = 0;
                belts ++;
            }
        }
//        priceSabers = Math.ceil(priceSabers * 0.10);
        double totalSum = ((countStudents - belts) * priceBelts) + (priceSabers * Math.ceil(countStudents + countStudents * 0.10)) + (countStudents * priceRobe);
        if(totalSum <= money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalSum - money);
        }
    }
}

