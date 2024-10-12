package Arrays2D;
import java.util.*;
public class q15_diagonalTraversal {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter rows and columns: ");
        int r=sc.nextInt(); int c=sc.nextInt();
        int matrix[][]= Matrix.create(r,c);
        
        int arr[]= new int[r*c];
        int i=0, j=0, k=0; Boolean up=true;
        while (i<r && j<c){
            if(up){
                while(i>0 && j<c-1){
                    arr[k++]=matrix[i][j];
                    i--; j++;
                }
                arr[k++]=matrix[i][j];
                if(j==c-1)             // edge case
                    i++;
                else
                    j++;
            }
            else{
                while(i<r-1 && j>0){
                    arr[k++]=matrix[i][j];
                    i++; j--;
                }
                arr[k++]=matrix[i][j];
                if(i==r-1)             // edge case
                    j++;
                else
                    i++;
            }
            up=!up;
        }
        System.out.println("Diagonal Traversal Array: ");
        for (int x: arr){
            System.out.print(x+" ");
        }
    }
}
