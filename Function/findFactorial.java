import java.util.Scanner;

public class findFactorial {
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Scanner will be auto-closed after try block
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int result = Factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}
