package Arrays.lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String temporary = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temporary;
        }
        System.out.println(String.join(" ",input));
    }
}
