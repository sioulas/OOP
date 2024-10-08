/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contract;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter project budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();

        System.out.print("Enter total duration: ");
        float totalDuration = scanner.nextFloat();

        System.out.print("Enter number of developers: ");
        int developersCount = scanner.nextInt();

        Project project = new Project(customerName, budget, projectName, totalDuration, developersCount);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter work type for task " + (i + 1) + ": ");
            int workType = scanner.nextInt();
            System.out.print("Enter duration for task " + (i + 1) + " (in person-months): ");
            float duration = scanner.nextFloat();
            project.addTask(workType, i, duration);
        }

        System.out.println(project.toString());
    }
}

