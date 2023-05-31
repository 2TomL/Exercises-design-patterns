package be.intecbrussel.FactoryDesignPattern;

import java.util.Scanner;

public class ComputerApp {
    public static void main(String[] args) {
        // Choose type, RAM, CPU, HDD
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter computer type:");
    String computerType = scanner.nextLine();

        System.out.println("Enter RAM:");
    String ram = scanner.nextLine();

        System.out.println("Enter CPU:");
    String cpu = scanner.nextLine();

        System.out.println("Enter HDD:");
    String hdd = scanner.nextLine();

    // Create
    Computer pc = ComputerFactory.createComputer(computerType, ram, cpu, hdd);
        if (pc != null) {
            // Print
        System.out.println("Computer Type: " + computerType);
        System.out.println("RAM: " + pc.getRam());
        System.out.println("CPU: " + pc.getCpu());
        System.out.println("HDD: " + pc.getHdd());
    } else {
        System.out.println("Invalid computer type!");
    }
        scanner.close();
    }
}
