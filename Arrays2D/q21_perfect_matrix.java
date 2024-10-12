// A square matrix is said to be perfect if only the diagonal elements are non-zero.
package Arrays2D;
import java.util.*;
public class q21_perfect_matrix {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter order of square matrix: ");
        int n= sc.nextInt();
        int arr[][]= Matrix.create(n, n);
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j || i+j+1==n){  
                // i==j for leading diagonal & i+j+1==n for second diagonal
                    if (arr[i][j]==0){
                        System.out.println("False");
                        return;
                    }
                } 
                else if (arr[i][j]!=0){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
