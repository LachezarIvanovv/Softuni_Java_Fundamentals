package Lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();


        for (int i = 0; i < number; i++) {
            String command = scanner.nextLine();
            String[] data = command.split("\\s+");
            String input = data[2];
            String currentName = data[0];
            if (input.equals("going!")) {
                if (names.contains(currentName)) {
                    System.out.printf("%s is already in the list!%n", currentName);
                } else {
                    names.add(currentName);
                }
            } else {
                if (names.contains(currentName)) {
                    names.remove(currentName);
                } else {
                    System.out.printf("%s is not in the list!%n", currentName);
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}

