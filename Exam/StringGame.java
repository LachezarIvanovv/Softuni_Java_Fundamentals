package Exam;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Change":
                    String character = command[1];
                    String replacement = command[2];
                    String replace = sb.toString().replace(character, replacement);
                    if(!replace.equals(sb.toString())){
                        sb.setLength(0);
                        sb.append(replace);
                        System.out.println(sb);
                        break;
                    }
                    System.out.println(sb);
//                    sb.toString().replace(character, replacement);
//                    System.out.println(sb);
                    break;
                case "Includes":
                    String substring = command[1];
                    if (sb.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String end = command[1];
                    if (sb.toString().contains(end)) {
                        int index = sb.lastIndexOf(end);
                        if (index >= sb.length() - end.length() - 1) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    break;
                case "Uppercase":
                    String upperCase = sb.toString().toUpperCase();
                    sb.setLength(0);
                    sb.append(upperCase);
                    System.out.println(sb);
                    break;
                case "FindIndex":
                    String letter = command[1];
                    int index = sb.indexOf(letter);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int count = Integer.parseInt(command[2]);
                    String subString = sb.toString().substring(startIndex, startIndex + count);
                    System.out.println(subString);
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
