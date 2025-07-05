// Diamond
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 

import java.util.*;

public class P15_Diamond {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size : ");
        int size = scan.nextInt();

        scan.close();

        for (int row = 1; row <= size; row++) {
            for (int space = row; space <= size - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 2 * row - 1; col >= 1; col--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = size - 1; row >= 1; row--) {
            for (int space = row; space <= size - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 2 * row - 1; col >= 1; col--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}