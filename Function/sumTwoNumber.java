// Create a function to add two numbers.

import java.util.Scanner;

public class sumTwoNumber {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter the first number: ");
         int num1 = sc.nextInt();
         System.out.println("Enter the second number: ");
         int num2 = sc.nextInt();

         int result = addFun(num1, num2);
         System.out.println("Sum of two number: " + result);
         sc.close();
      }
   }

   public static int addFun(int num1, int num2) {
      return num1 + num2;
   }
}
