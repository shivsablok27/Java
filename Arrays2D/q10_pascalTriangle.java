package Arrays2D;
import java.util.*;
public class q10_pascalTriangle {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter no. of rows for Pascal's triangle: ");
        int n= sc.nextInt();
        int ans[][]= new int [n][]; 
        // Columns are not fixed here as it is a Jagged Array.
        // In every successive row there are different no. of columns.
        for (int i=0; i<n; i++){
            // here we know, ith row have i+1 columns so we create individual rows
            ans[i]= new int [i+1];
            // first and last element of every row is 1 in Pascal's triangle
            ans[i][0] = ans[i][i] = 1;
            // In pascal's triangle every element is the sum of "element above it" 
            // and "element preceding the element above it.
            for (int j=1; j<i; j++){ // Note: j=1 and j=i+1 already filled with 1
                ans[i][j]= ans[i-1][j]+ ans[i-1][j-1];
            }
        }
        System.out.println("Pascal's Triangle for "+n+" rows is:");
        // we can't use our predefined print function in case of jagged array
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
