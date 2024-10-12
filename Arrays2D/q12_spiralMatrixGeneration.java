package Arrays2D;
import java.util.*;
public class q12_spiralMatrixGeneration {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the value of n: "); 
        int n= sc.nextInt();
        int matrix[][]=new int[n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1, co=1;
        while (co<=n*n){
            for (int j=leftCol; j<=rightCol && co<=n*n; j++){

                matrix[topRow][j]=co++;
            }
            topRow++;
            for (int i=topRow; i<=bottomRow && co<=n*n; i++){
                matrix[i][rightCol]=co++;
            }
            rightCol--;
            for (int j=rightCol; j>=leftCol && co<=n*n; j--){
                matrix[bottomRow][j]=co++;
            }
            bottomRow--;
            for (int i=bottomRow; i>=topRow && co<=n*n; i--){
                matrix[i][leftCol]=co++;
            }
            leftCol++;
        }
        Matrix.print(matrix,n,n);
    }
}
