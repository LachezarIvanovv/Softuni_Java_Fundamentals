package Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] tokens = command.split(" ");
            int digitForContains = Integer.parseInt(tokens[1]);
            switch (tokens[0]){
                case "Contains":
                    switch (tokens[1]){
                        case "100":
                        case "543":
                            int numberToContains = Integer.parseInt(tokens[1]);
                            if(numbers.contains(numberToContains)){
                                System.out.println("Yes");
                            }else{
                                System.out.println("No such number");
                            }
                            break;
                    }
                    break;
                case "Print":
                    switch (tokens[1]){
                        case "even":
                        case "odd":
                                List<Integer> evenNumbers = new ArrayList<>();
                                List<Integer> oddNumbers = new ArrayList<>();
                                for (int i = 0; i < numbers.size(); i++) {
                                    if(numbers.get(i) % 2 == 0){
                                        evenNumbers.add(numbers.get(i));
                                    }else{
                                        oddNumbers.add(numbers.get(i));
                                    }
                                }
                                if(tokens[1].equals("even")) {
                                    for (Integer evenNumber : evenNumbers) {
                                        System.out.print(evenNumber + " ");
                                    }
                                    System.out.println();
                                }else {
                                    for (Integer oddNumber : oddNumbers) {
                                        System.out.print(oddNumber + " ");
                                    }
                                    System.out.println();
                                }
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (tokens[1]){
                        case ">=":
                        case "<=":
                        case ">":
                        case "<":
                            List<Integer> biggerOrEqual = new ArrayList<>();
                            List<Integer> smallerOrEqual = new ArrayList<>();
                            List<Integer> bigger = new ArrayList<>();
                            List<Integer> smaller = new ArrayList<>();
                            int digit = Integer.parseInt(tokens[2]);

                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) >= digit){
                                    biggerOrEqual.add(numbers.get(i));
                                }else if(numbers.get(i) <= digit) {
                                    smallerOrEqual.add(numbers.get(i));
                                }
                            }
                            for (int i = 0; i < numbers.size(); i++) {
                                if(numbers.get(i) > digit){
                                bigger.add(numbers.get(i));
                                }else if(numbers.get(i) < digit){
                                    smaller.add(numbers.get(i));
                                }
                            }
                            switch (tokens[1]){
                                case ">=":
                                    for (Integer integer : biggerOrEqual) {
                                        System.out.print(integer + " ");
                                    }
                                    System.out.println();
                                    break;
                                case "<=":
                                    for (Integer integer : smallerOrEqual) {
                                        System.out.print(integer + " ");
                                    }
                                    System.out.println();
                                    break;
                                case ">":
                                    for (Integer integer : bigger) {
                                        System.out.print(integer + " ");
                                    }
                                    System.out.println();
                                    break;
                                case "<":
                                    for (Integer integer : smaller) {
                                        System.out.print(integer + " ");
                                    }
                                    System.out.println();
                                    break;
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
