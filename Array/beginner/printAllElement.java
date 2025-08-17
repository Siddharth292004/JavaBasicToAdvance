
import java.util.Scanner;

public class printAllElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.err.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.err.println("Enter the element in array:");
            for (int i = 0; i < array.length; i++) {
                System.err.print("arr[" + (i + 1) + "]");
                array[i] = sc.nextInt();
            }

            System.out.println("\nElement of the array: ");
            for (int i = 0; i < array.length; i++) {
                System.err.println("arr[" + i + "] = " + array[i]);
            }

        } catch (Exception e) {
            System.out.println("invalid input ! please enter valid input.\n");
        }
    }
}
