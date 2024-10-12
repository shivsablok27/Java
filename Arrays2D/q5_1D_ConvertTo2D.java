package Arrays2D;
import java.util.*;
public class q5_1D_ConvertTo2D {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter m: "); int m=sc.nextInt();
        System.out.print("Enter n: "); int n=sc.nextInt();
        int l= m*n;
        System.out.println("Enter "+l+" elements");
        int arr_1D[]= new int [l];
        for (int i=0; i<l; i++){
            arr_1D[i]= sc.nextInt();
        }
        Arrays.sort(arr_1D);
        int arr_2D[][] = new int[m][n];
        int k=0;
        System.out.println("Converted 2D array of "+m+" rows and "+n+" columns is: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr_2D[i][j]=arr_1D[k++];
                System.out.print(arr_2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
