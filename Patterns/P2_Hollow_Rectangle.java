// Hollow Rectangle
// * * * * *
// *       *
// *       *
// * * * * *

import java.util.*;

public class P2_Hollow_Rectangle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();
        System.out.print("Enter the Columns : ");
        int maxCol = scan.nextInt();
        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int col = 1; col <= maxCol; col++) {
                if (row == 1 || row == maxRow || col == 1 || col == maxCol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
