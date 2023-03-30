package Methods.lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        repeatingString(input,quantity);

    }
    public static void repeatingString(String input, int quantity){
        for (int i = 1; i <= quantity; i++) {
            System.out.print(input);
        }
    }
}
