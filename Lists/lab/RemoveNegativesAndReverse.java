package Lists.lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) >= 0){
                positiveNumbers.add(numbers.get(i));
            }
        }
        if(positiveNumbers.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(positiveNumbers);
            for (int i = 0; i < positiveNumbers.size(); i++) {
                System.out.print(positiveNumbers.get(i) + " ");
            }
        }
    }
}
