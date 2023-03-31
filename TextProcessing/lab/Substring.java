package TextProcessing.lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String string = scanner.nextLine();

        while(string.contains(key)) {
            int counter = key.length();
            int beginIndex = string.indexOf(key);
            int endIndex = beginIndex + counter;
            if(string.contains(key)){
                string = string.substring(0, beginIndex) + string.substring(endIndex);
            }
        }
        System.out.println(string);
    }
}
