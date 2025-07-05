// Hollow Diamond
//         * 
//       *   * 
//     *       * 
//   *           * 
// *               * 
//   *           * 
//     *       * 
//       *   * 
//         * 

import java.util.*;

public class P16_Hollow_Diamond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int size = scan.nextInt();

        scan.close();

        for (int row = 1; row <= size; row++) {
            for (int space = size; space - row >= 1; space--) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for (int space = 1; space < 2 * (row - 1); space++) {
                System.out.print("  ");
            }

            if (row > 1) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row <= size - 1; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            for (int space = 1; space < 2 * (size - row - 1); space++) {
                System.out.print("  ");
            }

            if (row != size - 1) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}