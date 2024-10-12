package Arrays2D;
import java.util.*;
public class Array2d{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of 2D array (rows & columns): ");
        int r= sc.nextInt(); int c= sc.nextInt();
        int arr[][]=new int [r][c];
        System.out.println(arr[0].length);
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.printf("Enter element [%d][%d]: ", i, j);
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
