// Butterfly
// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 

import java.util.*;

public class P13_Butterfly {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int size = scan.nextInt();

        scan.close();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            for (int space = (size - row) * 2; space >= 1; space--) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row <= size; row++) {
            for (int col = row; col <= size; col++) {
                System.out.print("* ");
            }

            for (int space = (row - 1) * 2; space >= 1; space--) {
                System.out.print("  ");
            }

            for (int col = row; col <= size; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}