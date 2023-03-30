package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> waggons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] input = command.split(" ");
            if(input[0].equals("Add")){
                int number = Integer.parseInt(input[1]);
                waggons.add(number);
                command = scanner.nextLine();
                continue;
            }
            int number = Integer.parseInt(input[0]);
            if(number <= maxCapacity){
                for (int i = 0; i < waggons.size(); i++) {
                    if(number + waggons.get(i) <= maxCapacity){
                        waggons.set(i, waggons.get(i) + number);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (Integer waggon : waggons) {
            System.out.print(waggon + " ");
        }
    }
}
