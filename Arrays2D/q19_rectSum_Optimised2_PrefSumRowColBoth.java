package Arrays2D;
import java.util.*;
public class q19_rectSum_Optimised2_PrefSumRowColBoth {
    static Scanner sc= new Scanner (System.in);
    static void calculatePrefixSum(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        // calculating prefix sum horizontally
        for (int i=0; i<r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // calculating prefix sum vertically of "horizontally prefix sum matrix"
        for (int j=0; j<c; j++){
            for (int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
        // now, it is observed that corner element of any rectangle formed holds the sum
        // of all the elements of that selected rectangle from 0,0 to corner range point.
    } 
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]= Matrix.create(row, col);
        System.out.println("Enter matrix boundaries for sum calculation: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        calculatePrefixSum(matrix);
        int sum=0, total=0, upRect=0, leftRect=0, DoubleSubtracted=0;

        total= matrix[r2][c2];
        if (r1>0)
            upRect= matrix[r1-1][c2];
        if (c1>0)
            leftRect= matrix[r2][c1-1];
        if (r1>0 && c1>0)
            DoubleSubtracted=matrix[r1-1][c1-1];
        
        sum += total - upRect - leftRect + DoubleSubtracted;
        System.out.println("Required Range Sum = "+sum); 
    }
}
