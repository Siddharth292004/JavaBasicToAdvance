// 5. Product of Two Numbers

// Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

import java.util.Scanner;

public class program_05 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num1 ,num2;

        System.out.print("input first number: ");
        num1 = sc.nextInt();
        System.out.print("input second number: ");
        num2 = sc.nextInt();
        
        int mul = num1 * num2 ;
        
        System.out.println(+num1+" X "+num2+" = "+mul);

        sc.close();
    }
}
