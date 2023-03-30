package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            String data = command[0];
            String direction = command[1];

            if (data.equals("Add")) {
                int element = Integer.parseInt(command[1]);
                numbers.add(element);
            } else if (data.equals("Remove")) {
                int element = Integer.parseInt(command[1]);
                if (element < 0 || element >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(element);
                }
            } else if (data.equals("Insert")) {
                int index = Integer.parseInt(command[2]);
                int element = Integer.parseInt(command[1]);
                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, element);
                }
            } else if (data.equals("Shift")) {
                if (direction.equals("left")) {
                    int countTimes = Integer.parseInt(command[2]);
                    for (int i = 0; i < countTimes; i++) {
                        numbers.add(numbers.get(0));
                        numbers.remove(0);
                    }
                }
                if (direction.equals("right")) {
                    int countTimes = Integer.parseInt(command[2]);
                    for (int i = 0; i < countTimes; i++) {
                        numbers.add(0, numbers.get(numbers.size() - 1));
                        numbers.remove(numbers.size() - 1);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
