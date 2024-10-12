/*
Q18. Rotate the array k times.
Sample input:  A B C D E F (n=6)
Sample output: E F A B C D (for k=2)
*/
package Arrays;
import java.util.*;
public class q18_RotationArray {
    static char[] rotate(char arr[],int k){
        int n=arr.length; k=k%n; char ans[]= new char[n]; int j=0;
        for (int i=n-k; i<=n-1; i++){
            ans[j++]=arr[i];
        }
        for (int i=0; i<=n-k-1; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void print(char arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("No. of steps by which array is to be rotated: ");
        int k = sc.nextInt(); 
        char arr[]={'A','B','C','D','E','F'};
        char ans[]=rotate(arr,k);
        print(ans);
        sc.close();
    }
}
