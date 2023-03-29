package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isOneDigit = false;

        if(numbers.length <= 1){
            System.out.println(numbers[numbers.length - 1]);
            isOneDigit = true;
        }else{
            for (int repetitions = 0; repetitions < numbers.length - 1; repetitions++) {
                for (int i = 0; i < numbers.length - 1; i++) {
                    numbers[i] = numbers[i] + numbers[i + 1];
                }

            }
        }
        if(!isOneDigit) {
            System.out.println(numbers[0]);
        }
    }
}
