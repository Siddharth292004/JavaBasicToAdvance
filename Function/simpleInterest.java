import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the principal (P): ");
            float principal = sc.nextFloat();  // Fixed typo

            System.out.print("Enter the time in years (T): ");
            float year = sc.nextFloat();  // Should be nextFloat, not nextInt

            System.out.print("Enter the rate of interest (R): ");
            float rate = sc.nextFloat();

            // Correct formula for Simple Interest
            float simpleInt = (principal * year * rate) / 100;

            System.out.println("Simple Interest: " + simpleInt);
        } catch (Exception e) {
            System.out.println("Input is invalid! Please enter valid numbers.");
        }
    }
}
