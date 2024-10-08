
package development;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter project name: ");
        String name = scanner.nextLine();

        System.out.print("Enter project type: ");
        int projectType = scanner.nextInt();

        System.out.print("Enter total duration: ");
        float totalDuration = scanner.nextFloat();

        System.out.print("Enter number of developers: ");
        int developersCount = scanner.nextInt();

        Development project = new Development(name, projectType, totalDuration, developersCount);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter work type for task " + (i + 1) + ": ");
            int workType = scanner.nextInt();
            System.out.print("Enter duration for task " + (i + 1) + " (in person-months): ");
            float duration = scanner.nextFloat();
            project.addTask(workType, i, duration);
        }

        System.out.println(project.toString());
    }
}

