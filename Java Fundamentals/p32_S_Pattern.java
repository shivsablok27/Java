/*
S  S  S  S  S  S  S
S  *  *  *  *  *  *
S  *  *  *  *  *  *
S  S  S  S  S  S  S
*  *  *  *  *  *  S
*  *  *  *  *  *  S
S  S  S  S  S  S  S
*/

import java.util.Scanner;
public class p32_S_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number of rows: ");
        int r = sc.nextInt();
        int n1 = (r+1)/2;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == n1 || j == 1) {
                    System.out.print("S");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = n1 + 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == r || j == r) {
                    System.out.print("S");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        sc.close();
    }    
}
