package Methods.lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent

        double number = Double.parseDouble(scanner.nextLine());

        grades(number);
    }
    public static void grades(double number){
        if(number >= 2.00 && number < 3.00){
            System.out.println("Fail");
        }else if(number < 3.50){
            System.out.println("Poor");
        }else if(number < 4.50){
            System.out.println("Good");
        }else if(number < 5.50){
            System.out.println("Very good");
        }else if(number <= 6.00){
            System.out.println("Excellent");
        }
    }
}
