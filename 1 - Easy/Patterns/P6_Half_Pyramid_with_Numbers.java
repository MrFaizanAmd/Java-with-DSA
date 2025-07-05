// Half Pyramid with Numbers
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

import java.util.*;

public class P6_Half_Pyramid_with_Numbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}