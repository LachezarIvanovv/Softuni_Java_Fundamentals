package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        while(!input.equals("Clone them!")){
        int[] array = Arrays.stream(scanner.nextLine().split("!+")).mapToInt(Integer::parseInt).toArray();


            input = scanner.nextLine();
        }
    }
}
