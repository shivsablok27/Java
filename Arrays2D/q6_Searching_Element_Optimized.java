package Arrays2D;
import java.util.*;
public class q6_Searching_Element_Optimized {
    static Scanner sc= new Scanner (System.in) ;
    public static void main(String[] args) {
        System.out.print("Enter no of rows: ");            int r=sc.nextInt();
        System.out.print("Enter no of columns: ");         int c=sc.nextInt();
        int arr[][]= Matrix.create(r,c);
        System.out.print("Enter number to be searched: "); int x=sc.nextInt();
        
        int i=0, j=c-1;
        while (i<r && j>=0){
            if (arr[i][j]==x){
                System.out.println((i+1)+" Row and "+(j+1)+" Column");
                return;
            }
            if (arr[i][j]>x){
                j--;
            }
            else { // arr[i][j]<x 
                i++;
            }
        }
        System.out.println(-1); 
    }
}
