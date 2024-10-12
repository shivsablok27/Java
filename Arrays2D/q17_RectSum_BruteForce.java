package Arrays2D;
import java.util.*;
public class q17_RectSum_BruteForce {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter dimension of matrix: ");
        int row= sc.nextInt(), col= sc.nextInt();
        int arr[][]=Matrix.create(row, col);
        System.out.println("Enter Rectangle boundaries: "); 
        int r1= sc.nextInt(); 
        int c1= sc.nextInt(); 
        int r2= sc.nextInt(); 
        int c2= sc.nextInt();
        int sum=0;
        for (int i=r1; i<=r2; i++){
            for (int j=c1; j<=c2; j++){
                sum+= arr[i][j];
            }
        }
        System.out.println("Sum within given range boundaries = "+sum);
        sc.close();
    }
}
