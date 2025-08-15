// Create a function to add two numbers.

package Function;

import java.util.Scanner;

public class program_02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.println("Enter the second number: ");
      int num2 = sc.nextInt();

      int result = addFun(num1, num2);
      System.out.println("Sum of two number: " + result);
      sc.close();
   }

   public static int addFun(int num1, int num2) {
      return num1 + num2;
   }
}
