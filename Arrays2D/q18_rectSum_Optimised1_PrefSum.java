package Arrays2D;
import java.util.*;
public class q18_rectSum_Optimised1_PrefSum {
    static Scanner sc=  new Scanner (System.in);
    static void prefixSum(int [][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        for (int i=0; i<r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j]= matrix[i][j]+ matrix[i][j-1];
            }
        }
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
        prefixSum(matrix);
        int sum=0;
        for (int i=r1; i<=r2; i++){
            if (c1>0)
                sum+= matrix[i][c2]-matrix[i][c1-1];
            else
                sum+=matrix[i][c2];
        }
        System.out.println("Required Range sum = "+sum);
    }
}
