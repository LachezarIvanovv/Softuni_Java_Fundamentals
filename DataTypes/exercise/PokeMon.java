package DataTypes.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double fiftyPercent = n * 0.5;
        int pokedTargets = 0;

        while(n >= m) {
                n -= m;
                pokedTargets++;
            if(n == fiftyPercent && y != 0){
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(pokedTargets);
    }
}
