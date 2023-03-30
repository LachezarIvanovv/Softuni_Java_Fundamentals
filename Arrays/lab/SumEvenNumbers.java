package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;

        for (int i = 0; i < input.length; i++) {
            if(numbers[i] % 2 == 0){
                evenSum += numbers[i];
            }
        }
        System.out.println(evenSum);
    }
}
