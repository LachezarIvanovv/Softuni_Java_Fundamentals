package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int[] result = new int[numbers.length - count];

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.printf("%d ", numbers[i]);
            }
        }
    }
}

