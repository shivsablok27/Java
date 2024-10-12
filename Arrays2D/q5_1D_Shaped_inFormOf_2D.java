package Arrays2D;
import java.util.*;
public class q5_1D_Shaped_inFormOf_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter m: "); int m=sc.nextInt();
        System.out.print("Enter n: "); int n=sc.nextInt();
        int l= m*n;
        int arr[]= new int [l];
        for (int i=0; i<l; i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<l; i++){
            System.out.print(arr[i]+" ");
            if ((i+1)%n==0){
                System.out.println();
            }
        }
        sc.close();
    }
}
