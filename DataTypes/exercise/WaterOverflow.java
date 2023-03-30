package DataTypes.exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int litresOfWater = Integer.parseInt(scanner.nextLine());
            sum += litresOfWater;
            if(sum <= 255){
                continue;
            }else{
                System.out.println("Insufficient capacity!");
                sum -= litresOfWater;
            }
        }
        System.out.println(sum);
    }
}
