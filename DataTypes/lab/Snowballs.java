package DataTypes.lab;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double snowBallValue = 0;
        double maxSnowBallSnow = 0;
        double maxSnowBallTime = 0;
        double maxSnowBallQuality = 0;

        for (int i = 1; i <= number; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double sum = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);

            if(sum > snowBallValue){
                snowBallValue = sum;
                maxSnowBallSnow = snowBallSnow;
                maxSnowBallQuality = snowBallQuality;
                maxSnowBallTime = snowBallTime;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", maxSnowBallSnow, maxSnowBallTime, snowBallValue, maxSnowBallQuality);
    }
}
