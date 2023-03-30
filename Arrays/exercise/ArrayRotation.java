package Arrays.exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String[] temporary = new String[1];
            temporary[0] = array[0];
            for (int j = 0; j < array.length -1; j++) {
                array[j] = array[j + 1];
                if(j == array.length - 2){
                    array[j + 1] = temporary[0];
                    break;
                }
            }
        }
        System.out.println(String.join(" ", array));
    }
}
