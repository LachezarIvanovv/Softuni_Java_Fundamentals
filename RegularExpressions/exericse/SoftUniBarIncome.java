package RegularExpressions.exericse;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<quantity>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$");
        String input = scanner.nextLine();
        double income = 0;

        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            while(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                double currentIncome = quantity * price;
                income += currentIncome;

                System.out.printf("%s: %s - %.2f%n",name,product,currentIncome);

            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }
}
