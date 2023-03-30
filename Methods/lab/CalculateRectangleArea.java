package Methods.lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        rectangleArea(width,length);

    }
    public static void rectangleArea(int width, int length){
        int area = width * length;
        System.out.println(area);
    }
}
