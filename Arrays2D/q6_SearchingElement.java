package Arrays2D;
import java.util.*;
public class q6_SearchingElement {
    static Scanner sc = new Scanner (System.in); 
    public static void main(String[] args) {
        System.out.print("Enter no of rows: ");            int r=sc.nextInt();
        System.out.print("Enter no of columns: ");         int c= sc.nextInt();
        int arr[][]= Matrix.create(r,c);
        System.out.print("Enter number to be searched: "); int x=sc.nextInt();
        boolean found=false;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (arr[i][j]==x){
                    System.out.println("Row= "+(i+1)+" and column= "+(j+1));
                    found=true;
                }
            }
        }
        if (found==false)    System.out.println(-1);
    } 
}
