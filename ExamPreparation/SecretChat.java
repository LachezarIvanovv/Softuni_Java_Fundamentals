package ExamPreparation;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] splitCommand = command.split(":\\|:");
            switch (splitCommand[0]) {
                case "ChangeAll":
                    String occurrence = splitCommand[1];
                    String replacement = splitCommand[2];
                    String replacedString = sb.toString().replaceAll(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(splitCommand[1]);
                    if(sb.toString().contains(substring)){
                        int start = sb.indexOf(substring.toString());
                        int end = start + substring.length() - 1;
                        sb.delete(start, end + 1);
                        substring.reverse();
                        sb.append(substring);
                    }else{
                        System.out.println("error");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "InsertSpace":
                    int index = Integer.parseInt(splitCommand[1]);
                    sb.insert(index, " ");
                    break;
            }
            System.out.println(sb);
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sb.toString());
    }
}
