import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] array = new int[size];
            System.out.println("Enter the elements of array: ");
            
            for (int i = 0; i < size; i++) {
                System.out.print("arr[" + (i + 1) + "] = ");
                array[i] = sc.nextInt();
            }
            
            int max = array[0];
            int min = array[0];
            
            // Single loop to find max and min
            for (int i = 1; i < size; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            
            System.out.println("\nMaximum : " + max);
            System.out.println("Minimum : " + min);
            
        } catch (Exception e) {
            System.err.println("Invalid input! Please enter valid numbers.");
        }
    }
}
