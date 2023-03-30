package AssociativeArrays.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numbers = new TreeMap<>();

        for (double num : nums) {
            if(!numbers.containsKey(num)){
                numbers.put(num, 1);
            }else{
                int occurrences = numbers.get(num);
                occurrences++;
                numbers.put(num, occurrences);
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()), entry.getValue());
        }
    }
}
