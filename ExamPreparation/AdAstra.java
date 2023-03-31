package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    static class Food {
        String itemName;
        String expirationData;
        int calories;

        public String getItemName() {
            return itemName;
        }

        public String getExpirationData() {
            return expirationData;
        }

        public int getCalories() {
            return calories;
        }

        public Food(String itemName, String expirationData, int calories) {
            this.itemName = itemName;
            this.expirationData = expirationData;
            this.calories = calories;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([|#])(?<itemName>[A-za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<Food> foodList = new ArrayList<>();
        int totalCalories = 0;
        boolean isFound = matcher.find();

        while (isFound) {
            String itemName = matcher.group("itemName");
            String expiration = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food singleFood = new Food(itemName, expiration, calories);
            foodList.add(singleFood);
            totalCalories += calories;

            isFound = matcher.find();
        }
//      int days = foodList.stream().mapToInt(Food::getCalories).sum() / 2000;
        System.out.println("You have food to last you for: " + totalCalories / 2000 + " days!");
        foodList.forEach(s -> System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", s.itemName, s.expirationData, s.calories));
    }
}
