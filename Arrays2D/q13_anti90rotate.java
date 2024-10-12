package Arrays2D;
import java.util.*;
public class q13_anti90rotate {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns: ");
        int r=sc.nextInt();     
        int c=sc.nextInt();
        int arr[][] = Matrix.create(r,c);
        // first we will calculate the transpose of matrix
        for (int i=0; i<r; i++){
            for (int j=i; j<c; j++){
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // now we will reverse each column values 
        // (in 90 deg clockwise roatation, we reverse each row)
        for (int j=0; j<c; j++){
            int a=0, b=r-1; 
            while (a<b){
                int temp= arr[a][j];
                arr[a][j]=arr[b][j];
                arr[b][j]=temp;
                a++; b--;
            }
        }
        //printing modified matrix
        System.out.println("After 90 degree anticlockwise rotation");
        Matrix.print(arr, r, c);
    }
}
