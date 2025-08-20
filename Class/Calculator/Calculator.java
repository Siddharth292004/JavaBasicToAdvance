package Class.Calculator;
import java.util.Scanner;

class Calculation {
    int first;
    int second;

    // Methods
    int add() {
        return first + second;
    }

    int subtract() {
        return first - second;
    }

    int multiply() {
        return first * second;
    }

    double divide() {
        if (second == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) first / second;
    }
}

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int first = sc.nextInt();

            System.out.print("Enter the second number: ");
            int second = sc.nextInt();

            // Create object
            Calculation calc = new Calculation();

            // Assign values to object properties
            calc.first = first;
            calc.second = second;

            // Print results
            System.out.println("Addition: " + calc.add());
            System.out.println("Subtraction: " + calc.subtract());
            System.out.println("Multiplication: " + calc.multiply());
            System.out.println("Division: " + calc.divide());

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
}
