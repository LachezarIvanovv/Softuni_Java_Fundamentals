package MidExamPreparation.lab;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int totalStudents = Integer.parseInt(scanner.nextLine());

        int allEmployee = firstEmployee + secondEmployee + thirdEmployee;
        int totalHours = 1;


        while (totalStudents > 0){
            if(totalHours % 4 != 0) {
                totalStudents -= allEmployee;
            }
            totalHours++;
        }
        System.out.printf("Time needed: %dh.", totalHours - 1);
    }
}
