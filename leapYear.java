import java.util.Scanner;

public class leapYear {
    public static boolean CheckLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("Enter the year: ");
            int year = sc.nextInt();

            if (CheckLeapYear(year)) {
                System.out.println(year + " is a leap year.\n");
            } else {
                System.out.println(year+" is not a leap year.\n");
            }
        } catch (Exception e) {
            System.err.println("Invalid input ! Please enter valid number.\n");

        }
    }
}
