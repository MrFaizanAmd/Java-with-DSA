import java.util.*;

public class P2_Factorial {
    public static int factorial(int num) {
        if (num < 0) {
            return 0;
        }
        int fact = 1;
        for (int count = num; count >= 1; count--) {
            fact *= count;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int num = scan.nextInt();
        scan.close();

        System.out.println("Factorial is " + factorial(num));
    }
}