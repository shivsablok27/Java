package Arrays2D;
import java.util.*;
public class q22_UpperTriangularMatrix {
    static Scanner sc= new Scanner (System.in);
    static void upper (int[][]arr, int n){
        System.out.println("Upper Triangular Matrix is as follows: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j>=i)
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter order of square matrix: ");
        int n= sc.nextInt();
        int arr[][]= Matrix.create(n, n);
        upper (arr, n);  
    }
}
