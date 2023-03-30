package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];
            if (data[0].equals("Delete")) {
                int element = Integer.parseInt(data[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == element) {
                        numbers.remove(i);
                        i--;
                    }
                }
            } else if (data[0].equals("Insert")) {
                int element = Integer.parseInt(data[1]);
                int position = Integer.parseInt(data[2]);
                numbers.add(position, element);
            }

            line = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

