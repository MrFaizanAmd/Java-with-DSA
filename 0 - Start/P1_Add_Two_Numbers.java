import java.util.*;

public class P1_Add_Two_Numbers {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First No. : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second No. : ");
        int num2 = scan.nextInt();
        scan.close();

        System.out.println("Sum is " + sum(num1, num2));
    }
}