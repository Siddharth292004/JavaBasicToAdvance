import java.util.Scanner;
public class ArmStrong {
    public static void main (String []args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
           if(armStrongFun(num)){
            System.out.println(num+" is a armstrong.\n");
           }
           else{
            System.out.println( num+" is not a armstrong.\n");
           }
        }
        catch(Exception e){
            System.out.println("Invalid input ! please enter valid input.\n");
        }
    }
    public static boolean armStrongFun(int num){
        int org = num;
        int sum = 0;
        while(num >0){
            int remainder = num % 10;
            sum = sum + remainder * remainder * remainder;
            num/=10;
        }
        return org == sum;
    }
     
}
