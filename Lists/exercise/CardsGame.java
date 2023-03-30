package Lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> finalFirstDeck = new ArrayList<>();
        List<Integer> finalSecondDeck = new ArrayList<>();
//        int minOfFirstAndSecond = Math.min(firstDeck.size(), secondDeck.size());



        while(firstDeck.size() != 0 && secondDeck.size() != 0) {
            for (int i = 0; i < Math.min(firstDeck.size(), secondDeck.size()); i++) {
                if (firstDeck.get(i) > secondDeck.get(i)) {
                    firstDeck.add(firstDeck.get(i));
                    firstDeck.add(secondDeck.get(i));
                firstDeck.remove(i);
                secondDeck.remove(i);
                i--;
                } else if (firstDeck.get(i) < secondDeck.get(i)) {
                    secondDeck.add(secondDeck.get(i));
                    secondDeck.add(firstDeck.get(i));
                firstDeck.remove(i);
                secondDeck.remove(i);
                i--;
                }else{
                firstDeck.remove(i);
                secondDeck.remove(i);
                i--;
            }
            }
        }
        int sum = 0;
        if(firstDeck.size() > secondDeck.size()) {
            for (Integer integer : firstDeck) {
                sum += integer;
            }
            System.out.print("First player wins! Sum: ");
        }else{
            for (Integer integer : secondDeck) {
                sum += integer;
            }
            System.out.print("Second player wins! Sum: ");
        }
        System.out.print(sum);
    }
}
