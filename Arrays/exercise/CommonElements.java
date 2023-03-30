package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");


        for (int i = 0; i < input2.length; i++) {
            String secondElement = input2[i];
            for (String firstElement : input1) {
                if(secondElement.equals(firstElement)){
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
