package Methods.lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("int")) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(first, second));
        }
        if (input.equals("char")) {
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            System.out.println(getMax(first, second));
        }
        if (input.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first, second));
        }

    }

    private static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }
    private static String getMax(String first, String second){
        if(first.compareTo(second) >= 0){
            return  first;
        }
        return second;
    }
}
