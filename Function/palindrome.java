import java.util.Scanner;

public class palindrome {

    public static boolean PalindromeNumber(int num) {
        int org = num;
        int reverse = 0;
        int remainder;

        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return org == reverse;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // auto close
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            if (PalindromeNumber(num)) {
                System.out.println(num + " number is palindrome.\n");
            } else {
                System.out.println(num + " number is not palindrome.\n");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}
