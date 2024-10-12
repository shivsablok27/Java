//Q28. Check if we can partition an array into two sub arrays of equal sum.
package Arrays;
import java.util.*;
public class q28_SubArraySum {
    static void printPartition(int arr[], int i){
        for (int j=0; j<arr.length; j++){
            if (j==i){
                System.out.print("<--Partioned--> ");
            }
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    static int totalSum(int arr[], int n){
        int totalSum=0;
        for (int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalCheck(int arr[], int n){
        int totalSum=totalSum(arr,n); 
        int prefixSum=0;
        for (int i=0; i<n; i++){
            prefixSum+=arr[i];
            int suffixSum= totalSum-prefixSum;
            if (prefixSum==suffixSum){
                System.out.println("Partition is possible");
                printPartition(arr, i+1);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the size of array: "); 
        int n= sc.nextInt();
        int arr[]= new int [n];
        System.out.println("Enter "+n+" elements of array");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean x= equalCheck(arr, n);
        if (x==false)
            System.out.println("Partition is not possible");
        sc.close();
    }
}
