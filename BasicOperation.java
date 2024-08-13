package ScientificCalculator;

import java.util.Scanner;

public class BasicOperation {

    public static void performBasicOperation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Basic Operation");
        System.out.println("1.Addition(+)");
        System.out.println("2.Substraction(-)");
        System.out.println("3.Multiplicaton(*)");
        System.out.println("4.DIvision(/)");
        System.out.println("5.Modulus(%)");
        System.out.println("6.Quit");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        System.out.print("Enter the number of operands: ");
        int numOperands = input.nextInt();
        double[] operands = new double[numOperands];
        for (int i = 0; i < numOperands; i++) {
            System.out.print("Enter operand " + (i + 1) + ": ");
            operands[i] = input.nextDouble();
        }
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(operands));
                break;
            case 2:
                System.out.println("Result: " + sub(operands));
                break;
            case 3:
                System.out.println("Result: " + mul(operands));
                break;
            case 4:
                System.out.println("Result: " + div(operands));
                break;
            case 5:
                System.out.println("Result: " + mod(operands));
                break;
            case 6:
                System.out.println("Quitting....");
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    private static double add(double[] operands) {
        if (operands.length < 2) {
            System.out.println("Error, at least two operands are required for addition");
            return Double.NaN;
        }
        double result = 0;
        for (double operand : operands) {
            result += operand;
        }
        return result;
    }

    private static double sub(double[] operands) {
        if (operands.length < 2) {
            System.out.println("Error, at least two operands required for subtraction");
            return Double.NaN;
        }
        double result = operands[0];
        for (int i = 1; i < operands.length; i++) {
            result -= operands[i];
        }
        return result;
    }

    private static double mul(double[] operands) {
        if (operands.length < 2) {
            System.out.println("Error, at least two operands are required for multiplication");
            return Double.NaN;
        }
        double result = 1;
        for (double operand : operands) {
            result *= operand;
        }
        return result;
    }

    private static double div(double[] operands) {
        if (operands.length < 2) {
            System.out.println("Error, at least two operands are required for division");
            return Double.NaN;
        }
        double result = operands[0];
        for (int i = 1; i < operands.length; i++) {
            if (operands[i] != 0) {
                result /= operands[i];
            } else {
                System.out.println("Error, Division by zero");
                return Double.NaN;
            }
        }
        return result;
    }

    private static double mod(double[] operands) {
        if (operands.length < 2) {
            System.out.println("Error, at least two operands are required for modulus");
            return Double.NaN;
        }
        double result = operands[0];
        for (int i = 1; i < operands.length; i++) {
            result %= operands[i];
        }
        return result;
    }

}