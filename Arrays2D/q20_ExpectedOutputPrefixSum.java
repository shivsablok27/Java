/*
Sample Input : [ [1,2,3], [4,5,6], [7,8,9] ]
Sample Output: [ [1,3,6], [5,13,25], [12,33,67] ]
Algorithm: (Pen-Paper Analysis required): 
condition: element is at (0,0) --> Nothing.
condition: element is at (0,y) --> Horizontal Prefix Sum i.e. element(0,y) + element(0,y-1)
condition: element is at (x,0) --> Vertical Prefix Sum   i.e. element(x,0) + element(x-1,0)
condition: element is at (x,y) --> element(x,y) + element(x-1,y) + element(x,y-1) 
Every condition is to be applied on updated array, hence if else ladder will be used.
*/
package Arrays2D;
import java.util.*;
public class q20_ExpectedOutputPrefixSum {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of rows and columns: ");
        int r= sc.nextInt(); int c= sc.nextInt();
        int arr[][]= Matrix.create(r, c);
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (i==0 && j==0)
                    continue;
                else if (i==0)
                    arr[i][j] += arr[i][j-1];
                else if (j==0)
                    arr[i][j] += arr[i-1][j];
                else
                    arr[i][j] += arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println("Prefix Sum Matrix as expected output is: ");
        Matrix.print(arr, r, c);
    }
}
