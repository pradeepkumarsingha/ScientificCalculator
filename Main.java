package ScientificCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueOperation = true;
        while (continueOperation) {
            System.out.println("-----:Scientific Calculator:-----");
            System.out.println("--------------------------------");

            System.out.println("1.Basic Operation");
            System.out.println("2.Scientific Operation");
            System.out.println("3.Exit");
            System.out.print("Choose Operation : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    BasicOperation.performBasicOperation();
                    break;
                case 2:
                    ScientificOperation.performScientificOperation();
                    break;
                case 3:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            if (continueOperation) {
                System.out.print("Do you want to perform another operation? (yes/no): ");
                String response = input.next();
                if (response.equalsIgnoreCase("no")) {
                    continueOperation = false;
                }
            }

        }
    }
}
