import java.util.Scanner;

public class ReverseArray {
    public static void main (String [] args){
        try(Scanner sc = new Scanner( System.in)){
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println( "Enter the element in array: ");
            for(int i = 0; i < array.length; i++){
                System.out.print("arr["+(i+1)+"] = ");
                array[i] = sc.nextInt();
            }
             Reverse(array,size);
        }
    }
    public static void Reverse(int [] array,int size){
      int reverse = 0;

      for(int i =0; i <size/2 ; i++){
        int temp =array[i];
        array[i] = array[size -1];
        array[size -1] = temp;
        
      }

      }
    }
    
}
