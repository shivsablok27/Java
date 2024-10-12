package Arrays2D;
import java.util.*;
public class q7_rangeSum {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter no of rows: ");       int r=sc.nextInt();
        System.out.print("Enter no of columns: ");    int c= sc.nextInt();
        int arr[][]= Matrix.create(r,c);
        System.out.print("Enter range of rows: ");    
        int r1= sc.nextInt(); int r2= sc.nextInt();
        System.out.print("Enter range of columns: "); 
        int c1= sc.nextInt(); int c2= sc.nextInt();

        int sum=0;
        for (int i=r1; i<=r2; i++){
            for (int j=c1; j<=c2; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of Matrix in given range= "+ sum);
    }
}
