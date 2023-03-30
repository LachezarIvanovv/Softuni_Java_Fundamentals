package Lists.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        for (int i = 0; i < input.size(); i++) {
            int currentNumber = input.get(i);
            if(currentNumber < 0){
                input.remove(input.get(i));
                i--;
            }
        }

        Collections.reverse(input);

        if(input.isEmpty()){
            System.out.println("empty");
        }else{
            for (Integer integer : input) {
                System.out.print(integer + " ");
            }
        }
    }
}
