// Opposite Half Pyramid
//       * 
//     * * 
//   * * * 
// * * * * 

import java.util.*;

public class P5_Opposite_Half_Pyramid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int space = row; space <= row - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}