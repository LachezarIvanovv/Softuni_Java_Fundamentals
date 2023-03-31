package ExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String tour = scanner.nextLine();


        while(!tour.equals("Travel")){
            String[] destination = tour.split(":");
            switch (destination[0]){
                case "Add Stop":
                    int index = Integer.parseInt(destination[1]);
                    String strToInsert = destination[2];
                    if(index >= 0 && index < input.length()){
                        input.insert(index, strToInsert);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(destination[1]);
                    int endIndex = Integer.parseInt(destination[2]);
                    if(startIndex >= 0 && startIndex < input.length() && endIndex >= 0 && endIndex < input.length()){
                        input.delete(startIndex,endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldStr = destination[1];
                    String newStr = destination[2];
                    index = input.indexOf(oldStr);
                    while(index != -1){
                        input.replace(index, index + oldStr.length(), newStr);
                        index = input.indexOf(oldStr, index + newStr.length());
                    }
                    break;
            }
            System.out.println(input);

            tour = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + input);
    }
}
