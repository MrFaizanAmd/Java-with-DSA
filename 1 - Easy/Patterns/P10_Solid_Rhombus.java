// Solid Rhombus
//       * * * * 
//     * * * * 
//   * * * * 
// * * * * 

import java.util.*;

public class P10_Solid_Rhombus {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int space = row; space <= maxRow; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= maxRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}