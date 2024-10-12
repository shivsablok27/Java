package Arrays2D;
import java.util.*;
public class q8_transpose {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns: ");
        int r=sc.nextInt();     int c=sc.nextInt();
        int matrix[][]= Matrix.create(r,c);
        int tmatrix[][]= new int [c][r];
        for (int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                tmatrix[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose of entered matrix is: ");
        Matrix.print(tmatrix, c, r);
    }
}
