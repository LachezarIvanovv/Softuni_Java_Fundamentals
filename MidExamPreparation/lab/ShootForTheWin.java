package MidExamPreparation.lab;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int totalShot = 0;

        while (!command.equals("End")) {
            int targetIndex = Integer.parseInt(command);
            if (targetIndex >= 0 && targetIndex < targets.length) {
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1) {
                    totalShot++;
                    targets[targetIndex] = -1;
                    registerTargetHit(targets, shotTarget);
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShot);
        printArray(targets, " ");
    }

    private static void printArray(int[] targets, String separator) {
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i]);
            System.out.print(separator);
        }
    }

    private static void registerTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if(targets[i] != -1) {
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else {
                    targets[i] += shotTarget;
                }
            }
        }
    }
}
    
