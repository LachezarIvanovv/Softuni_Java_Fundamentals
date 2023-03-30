package Arrays.exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstLine = new String[n];
        String[] secondLine = new String[n];


        for (int i = 1; i <= n; i++) {
            String[] lines = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstLine[i -1] = lines[0];
                secondLine[i - 1] = lines[1];
            } else {
                firstLine[i - 1] = lines[1];
                secondLine[i -1] = lines[0];
            }
        }
        System.out.println(String.join(" ", firstLine));
        System.out.println(String.join(" ", secondLine));
    }
}
