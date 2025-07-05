// Palindromic Number Pyramid
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

import java.util.*;

public class P12_Palindromic_Number_Pyramid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            for (int space = row; space <= maxRow - 1; space++) {
                System.out.print("  ");
            }

            // Print descending numbers from row to 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Print ascending numbers from 2 to row
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}