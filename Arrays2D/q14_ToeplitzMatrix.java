package Arrays2D;
import java.util.*;
public class q14_ToeplitzMatrix{
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter no. of rows and columns: ");
        int r= sc.nextInt(), c= sc.nextInt();
        int arr[][]= Matrix.create(r, c);
        for (int i=1; i<r; i++){
            for (int j=1; j<c; j++){
                if (arr[i][j]!=arr[i-1][j-1]){
                    System.out.println("No...Not Toeplitz Matrix");
                    return;
                }
            }
        }
        System.out.println("Yes...Toeplitz Matrix");
    }
}