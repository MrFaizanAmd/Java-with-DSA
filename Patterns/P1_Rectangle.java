// Rectangle
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.*;

public class P1_Rectangle {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        System.out.print("Enter the Columns : ");
        int maxCol = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}