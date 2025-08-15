// 6. Basic Arithmetic Operations

// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

public class program_06 {
    public static void main(String [] args){
        int num1,num2;
        int sum,sub,mul,div,mod;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        num1 = sc.nextInt();
        System.out.print("input second number: ");
        num2 = sc.nextInt();
        
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(+num1+" mod "+num2+" = "+mod);
        sc.close();
    }
    
}
