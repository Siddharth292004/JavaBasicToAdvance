import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Input size of array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            // Create array and input elements
            int[] array = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            // Display the array
            System.out.print("Array elements: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Input element to search
            System.out.print("Enter the element to search: ");
            int searchEle = sc.nextInt();

            // Search element in array
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == searchEle) {
                    System.out.println(searchEle + " found at index " + i);
                    found = true;
                }
            }

            if (!found) {
                System.out.println(searchEle + " is not found in the array.");
            }
        } 
        // Optional: catch block to handle wrong input (like letters instead of numbers)
        catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}
