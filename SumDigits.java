import java.util.Scanner;

public class SumDigits {

    public static int Sum1(int d) {

        if (d == 0) {
            return 0;
        }

        return d % 10 + Sum1(d / 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int d = sc.nextInt();
        int result = Sum1(d);
        System.out.println("Sum of digits: " + result);
    }
}
