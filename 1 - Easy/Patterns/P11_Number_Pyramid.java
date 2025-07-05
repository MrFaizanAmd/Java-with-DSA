// Number Pyramid
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

import java.util.*;

public class P11_Number_Pyramid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int space = row; space <= maxRow; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}