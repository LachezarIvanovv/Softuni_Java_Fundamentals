package ExamPreparation;

import java.util.Scanner;

public class TheLimitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cryptMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] command = input.split("[\\|]");
            switch (command[0]) {
                case "Move":
                    cryptMessage = move(cryptMessage, Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    cryptMessage = insert(cryptMessage, Integer.parseInt(command[1]),command[2]);
                    break;
                case "ChangeAll":
                    cryptMessage = changeAll(cryptMessage, command[1], command[2]);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + cryptMessage);
    }

    private static String changeAll(String cryptMessage, String substring, String replacement) {
        return cryptMessage.replace(substring, replacement);
    }

    private static String insert(String cryptMessage, int index, String substring) {
        String firstPart = cryptMessage.substring(0, index);
        String secondPart = cryptMessage.substring(index);
        return firstPart + substring + secondPart;
    }


    private static String move(String cryptMessage, int length) {
        String firstPart = cryptMessage.substring(0, length);
        String secondPart = cryptMessage.substring(length);
        return secondPart + firstPart;
    }
}
