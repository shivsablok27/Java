package Arrays2D;
import java.util.*;
public class q4_ReverseRow2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int r= sc.nextInt();
        System.out.print("Enter the number of columns: " );
        int c= sc.nextInt();
        int arr[][]= new int [r][c];
        System.out.println("Enter values of array");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<r; i++){
            int a=0, b=c-1;
            while (a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++; b--;
            }
        }
        System.out.println("Reversed row array is: ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
