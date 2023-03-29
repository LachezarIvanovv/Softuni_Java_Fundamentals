package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        1.	Day of Week

//        int n = Integer.parseInt(scanner.nextLine());
//        String[] dayOfWeek = {"Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//
//        if(n >= 1 && n <= 7){
//            System.out.println(dayOfWeek[n - 1]);
//        }else{
//            System.out.println("Invalid day!");
//        }


//        2.	Print Numbers in Reverse Order

//        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[n];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] += Integer.parseInt(scanner.nextLine());
//        }
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }


//        3.	Sum Even Numbers

//        String[] input = scanner.nextLine().split(" ");
//        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for (int number : numbers) {
//            if(number % 2 == 0){
//                evenSum += number;
//            }
//        }
//        System.out.println(evenSum);


//        4.	Reverse an Array of Strings

//        String[] input = scanner.nextLine().split(" ");
//
//        for (int i = 0; i <= input.length / 2; i++) {
//            String reversed = input[i];
//            input[i] = input[input.length - i - 1];
//            input[input.length - i - 1] = reversed;
//        }
//        System.out.println(String.join(" ", input));


//        5.	Even and Odd Subtraction

//        String[] input = scanner.nextLine().split(" ");
//        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for (int number : numbers) {
//            if(number % 2 == 0){
//                evenSum += number;
//            }else{
//                oddSum += number;
//            }
//        }
//        int result = evenSum - oddSum;
//        System.out.println(result);


//        6.	Equal Arrays

//        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        boolean areIdentical = true;
//        int sum = 0;
//
//        for (int i = 0; i < firstArray.length; i++) {
//            if(firstArray[i] != secondArray[i]){
//                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
//                areIdentical = false;
//                break;
//            }else{
//                sum += firstArray[i];
//            }
//        }
//        if(areIdentical){
//            System.out.printf("Arrays are identical. Sum: %d", sum);
//        }


//        7.	Condense Array to Number

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
