package Lists.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  1.  Sum Adjacent Equal Numbers

//        String[] userInput = scanner.nextLine().split(" ");
//        List<Double> numberList = new ArrayList<>();
//
//        for (String stringInput : userInput) {
//            numberList.add(Double.parseDouble(stringInput));
//        }
//        List<Double> streamList = Arrays.stream(userInput).map(Double::parseDouble).collect(Collectors.toList());
//
//        // 3 3 6 1
//        // 6 3 6 1
//        // 6 6 1
//        // 12 1
//
//        for (int i = 0; i < numberList.size() -1; i++) {
//            if (numberList.get(i).equals(numberList.get(i + 1))) {
//                double sum = numberList.get(i) + numberList.get(i + 1);
//                numberList.set(i, sum);
//                numberList.remove(i + 1);
//                i = -1;
//            }
//        }
//        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.#");
//        for (Double number : numberList) {
//            System.out.print(decimalFormat.format(number) + " ");
//        }

//  2. Gauss' Trick

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        // 1 2 3 4 5 6
//        // 7 7 7
//
//        for (int i = 0; i < numbers.size(); i++) {
//            if(i == numbers.size() - 1){
//                break;
//            }
//            int currentElement = numbers.get(i);
//            int oppositeElement = numbers.get(numbers.size() - 1);

//            numbers.set(i, currentElement + oppositeElement);
//            numbers.remove(numbers.size() - 1);
//        }
//        for (Integer number : numbers) {
//            System.out.print(number + " ");
//        }

//  3. Merging Lists

//        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt).toList();
//
//        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt).toList();
//
//        int size = Math.min(firstList.size(), secondList.size());
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");
//        }
//        printTheRest(firstList, size);
//        printTheRest(secondList, size);
//    }
//    private static void printTheRest(List<Integer> numbers, int beginIndex){
//        for (int i = beginIndex; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//        }

//  6. List of Products

//        int n = Integer.parseInt(scanner.nextLine());
//        List<String> products = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            products.add(scanner.nextLine());
//        }
//
//        Collections.sort(products);
//
//        for (int i = 0; i < products.size(); i++) {
//            System.out.printf("%d.%s%n", i+1, products.get(i));
//        }

//  7. Remove Negatives and Reverse

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt).toList();
//
//        numbers = removeNegativeNumbers(numbers);
//        Collections.reverse(numbers);
//
//        if(numbers.isEmpty()){
//            System.out.println("empty");
//        }else{
//            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
//        }
//
//    }
//
//    private static List<Integer> removeNegativeNumbers(List<Integer> numbers) {
//        for (int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i) < 0){
//                numbers.remove(i);
//                i = i - 1;
//            }
//        }
//        return numbers;

        List<Integer> number = new ArrayList<>(Arrays.asList(10,20,30,40));

        number.remove(2);

        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
    }
}
