package AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> userData = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String userName = input[1];

            if(command.equals("register")){
                String licensePlateNumber = input[2];
                if(userData.containsKey(userName)){
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }else {
                    userData.put(userName, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n",userName, licensePlateNumber);
                }
            }else{
                if(!userData.containsKey(userName)){
                    System.out.printf("ERROR: user %s not found%n", userName);
                }else{
                    userData.remove(userName);
                    System.out.printf("%s unregistered successfully%n",userName);
                }
            }
        }

        userData.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
