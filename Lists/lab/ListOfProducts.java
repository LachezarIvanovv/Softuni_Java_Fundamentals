package Lists.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }

        Collections.sort(products);
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
