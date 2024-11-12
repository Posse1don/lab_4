package org.example;

import java.util.Scanner;

public class ComputerConfigurationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\nВиберіть тип комп'ютера, який ви хочете сконфігурувати:");
            System.out.println("1. Gaming PC");
            System.out.println("2. Office PC");
            System.out.println("3. Budget PC");
            System.out.println("0. Завершити програму");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();

            ComputerBuilder builder;
            switch (choice) {
                case 1:
                    builder = new GamingComputerBuilder();
                    break;
                case 2:
                    builder = new OfficeComputerBuilder();
                    break;
                case 3:
                    builder = new BudgetComputerBuilder();
                    break;
                case 0:
                    System.out.println("Завершення програми...");
                    continueRunning = false;
                    continue;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    continue;
            }

            ComputerDirector director = new ComputerDirector(builder);
            Computer pc = director.constructComputer();

            System.out.println("\nВаша конфігурація:");
            pc.showConfiguration();
        }
        scanner.close();
    }
}





