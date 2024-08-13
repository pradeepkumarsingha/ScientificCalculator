package ScientificCalculator;

import java.util.Scanner;

public class ScientificOperation {

    public static void performScientificOperation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Scientific Operations:");
        System.out.println("1. Logarithm");
        System.out.println("2. Sine");
        System.out.println("3. Cosine");
        System.out.println("4. Tangent");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. Pi");
        System.out.println("8. Epsilon");
        System.out.println("9. Inverse");
        System.out.println("10. Factorial");
        System.out.println("11. Exponential");
        System.out.println("12.Quit");
        System.out.print("Enter Your choice: ");
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
                if (numOperands != 1) {
                    System.out.println("Error, logarithm requires one operand");
                } else {
                    System.out.println("Result: " + log(operands[0]));
                }
                break;
            case 2:
                if (numOperands != 1) {
                    System.out.println("Error, sine requires one operand");
                } else {
                    System.out.println("Result: " + sin(operands[0]));
                }
                break;
            case 3:
                if (numOperands != 1) {
                    System.out.println("Error, cosine requires one operand");
                } else {
                    System.out.println("Result: " + cos(operands[0]));
                }
                break;
            case 4:
                if (numOperands != 1) {
                    System.out.println("Error, tangent requires one operand");
                } else {
                    System.out.println("Result: " + tan(operands[0]));
                }
                break;
            case 5:
                if (numOperands != 2) {
                    System.out.println("Error, power requires two operands");
                } else {
                    System.out.println("Result: " + pow(operands[0], operands[1]));
                }
                break;
            case 6:
                if (numOperands != 1) {
                    System.out.println("Error, square root requires one operand");
                } else {
                    System.out.println("Result: " + sqrt(operands[0]));
                }
                break;
            case 7:
                if (numOperands != 1) {
                    System.out.println("Error, pi requires one operand");
                } else {
                    System.out.println("Result: " + Pi(operands[0]));
                }
                break;
            case 8:
                if (numOperands != 1) {
                    System.out.println("Error, epsilon requires one operand");
                } else {
                    System.out.println("Result: " + Epsilon(operands[0]));
                }
                break;
            case 9:
                if (numOperands != 1) {
                    System.out.println("Error, inverse requires one operand");
                } else {
                    System.out.println("Result: " + Inverse(operands[0]));
                }
                break;
            case 10:
                if (numOperands != 1) {
                    System.out.println("Error, factorial requires one operand");
                } else {
                    System.out.println("Result: " + factorial((int) operands[0]));
                }
                break;
            case 11:
                if (numOperands != 1) {
                    System.out.println("Error, exponential requires one operand");
                } else {
                    System.out.println("Result: " + exp(operands[0]));
                }
                break;
            case 12:
                System.out.println("Quitting.....");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static double log(double operand) {
        return Math.log(operand);
    }

    private static double sin(double operand) {
        return Math.sin(Math.toRadians(operand));
    }

    private static double cos(double operand) {
        return Math.cos(Math.toRadians(operand));
    }

    private static double tan(double operand) {
        return Math.tan(Math.toRadians(operand));
    }

    private static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    private static double sqrt(double operand) {
        return Math.sqrt(operand);
    }

    private static double Pi(double operand) {
        return operand * Math.PI;
    }

    private static double Epsilon(double operand) {
        return operand * Math.E;
    }

    private static double factorial(int operand) {
        if (operand < 0) {
            System.out.println("Error, factorial is not defined for negative numbers");
            return Double.NaN;
        }
        double result = 1;
        for (int i = 1; i <= operand; i++) {
            result *= i;
        }
        return result;
    }

    private static double Inverse(double operand) {
        return 1 / operand;
    }

    private static double exp(double operand) {
        return Math.exp(operand);
    }
}
