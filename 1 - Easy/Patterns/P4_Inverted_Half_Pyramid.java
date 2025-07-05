// Inverted Half Pyramid
// * * * * 
// * * * 
// * * 
// * 

import java.util.*;

public class P4_Inverted_Half_Pyramid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = maxRow; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}