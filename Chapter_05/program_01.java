// Check Positive or Negative Number

// Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data
// Input number: 35


package Chapter_05;
import java.util.Scanner;

public class program_01 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input number: ");
        int input = sc.nextInt();

        if ( input > 0)
        {
            System.out.println("Number is positive.\n");
        }
        else if( input < 0)
        {
            System.out.println("Number is negative.\n");
        }
        else
        {
            System.out.println("Number is zero.\n");
        }
        sc.close();
    }
}
