// Floyd’s Triangle
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

import java.util.*;

public class P8_Floyds_Triangle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int maxRow = scan.nextInt();

        scan.close();

        int num = 1;

        for (int row = 1; row <= maxRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}