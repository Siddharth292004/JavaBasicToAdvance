import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the element in array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print("arr[" + (i + 1) + "] = ");
                array[i] = sc.nextInt();

            }
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            System.out.println("Sum of array: " + sum);
        } catch (Exception e) {
            System.out.println("invalid input ! Please inter valid input.\n");
        }
    }

}
