package Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
               .map(Integer::parseInt)
               .collect(Collectors.toList());

    }
}
