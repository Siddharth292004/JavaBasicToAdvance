// Find Greatest Among Three Numbers

// Write a Java program that takes three numbers from the user and prints the greatest number.

// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87

package Chapter_05;
import java.util.Scanner;

public class program_03 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         
        int num1,num2,num3;
        int max;

        System.out.print("Input the 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        num3 = sc.nextInt();
     
        if (num1 >= num2 && num1 >= num3){
            max = num1;    
        }
        else if (num2 >= num1 && num2 >= num3){
            max = num2;
        }
        else{
            max = num3;
        }
        
        System.out.println("The greatest : "+max);
        sc.close();
    }
}
