package RegularExpressions.exericse;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^>{2}(?<product>[\\w]+)<{2}(?<price>[\\d.]+)!(?<quantity>\\d+)");
        String input = scanner.nextLine();
        List<String> purchases = new LinkedList<>();
        double totalMoney = 0;

        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                purchases.add(product);
                totalMoney += price * quantity;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Bought furniture:%n");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalMoney);
    }
}
