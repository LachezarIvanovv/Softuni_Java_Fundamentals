package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int max = Integer.MIN_VALUE;
        int currentElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                counter++;
                if (counter > max) {
                    max = counter;
                    currentElement = array[i];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(currentElement + " ");
        }
    }
}
