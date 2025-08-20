import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Enter the elements in array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print("arr[" + (i + 1) + "] = ");
                array[i] = sc.nextInt();
            }

            // Call reverse function
            Reverse(array, size);

            // Print reversed array
            System.out.print("Reversed Array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }

    public static void Reverse(int[] array, int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];  // Corrected index
            array[size - 1 - i] = temp;
        }
    }
}
