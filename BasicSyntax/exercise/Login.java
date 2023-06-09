package basicSyntax.exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int count = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            count++;
            if(input.equals(password)){
                System.out.printf("User %s logged in.", username);
                break;
            }
            if(count == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }else{
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
