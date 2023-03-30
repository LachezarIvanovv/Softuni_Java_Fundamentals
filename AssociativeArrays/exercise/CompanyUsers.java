package AssociativeArrays.exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> company = new LinkedHashMap<>();

        while(!command.equals("End")){
            String companyName = command.split(" -> ")[0];
            String employeeId = command.split(" -> ")[1];

            if(!company.containsKey(companyName)){
                company.put(companyName, new ArrayList<>());
            }
            if(!company.get(companyName).contains(employeeId)) {
                company.get(companyName).add(employeeId);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : company.entrySet()) {
            System.out.printf("%s%n", entry.getKey());

            for(String employee: entry.getValue()){
                System.out.printf("-- %s%n", employee);
            }
        }
    }
}
