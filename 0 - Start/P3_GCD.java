import java.util.*;

public class P3_GCD {
    // Function to find GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder becomes new b
            a = temp; // Old b becomes new a
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        System.out.println("GCD is: " + findGCD(num1, num2));
    }
}