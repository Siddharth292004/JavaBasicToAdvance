
import java.util.Scanner;

public class program_03 {
    public static int Reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int last_digit = num % 10;
            reverse = reverse * 10 + last_digit;
            num /= 10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int result = Reverse(num);
            System.out.println("Reversed number: " + result); // print result
            sc.close();
        }
    }
}
