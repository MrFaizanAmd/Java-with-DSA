import java.util.*;

public class P4_Fibbonacci_Series {
    public static void fibnacci(int num) {
        int first = 0, second = 1;
        for (int count = 1; count <= num; count++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the terms : ");
        int num = scan.nextInt();
        scan.close();

        fibnacci(num);
    }
}