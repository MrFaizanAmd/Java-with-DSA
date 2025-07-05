// Pascals Triangle
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

import java.util.*;

public class P17_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        for (int row = 1; row <= maxRow; row++) {
            int num = 1;

            for (int space = 1; space <= maxRow - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / col;
            }

            System.out.println();
        }
    }
}