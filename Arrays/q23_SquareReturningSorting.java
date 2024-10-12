// Q23. Given an array sorted in non decreasing order, return an array of 
//      squares of each number sorted in non decreasing order.
package Arrays;
import java.util.*;
public class q23_SquareReturningSorting {
    static int[] squaredArray(int array[]){
        int n=array.length, a=0, b=n-1, j=n-1;
        int ans[]=new int[n];
        while (a<=b){
            if (Math.abs(array[a])>Math.abs(array[b])){
                ans[j--]=array[a]*array[a];
                a++;
            }
            else{
                ans[j--]=array[b]*array[b];
                b--;
            }
        }
        return ans;
    }
    // static void reverseArray(int ans[]){
    //     int n=ans.length, i=0, j=n-1;
    //     while(i<j){
    //         swapArray(ans,i,j);
    //         i++; j--;
    //     }
    // }
    // static void swapArray(int ans[],int i, int j){
    //         int temp=ans[i];
    //         ans[i]=ans[j];
    //         ans[j]=temp;
    // }
    static void printArray(int array[]){
        int n=array.length;
        for (int i=0; i<n; i++){
            System.out.print(array[i]+" "); 
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter elements of array");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int ans[]= squaredArray(arr);
        //reverseArray(ans);
        System.out.println("Required non-decreasing sorted Array of squares of values: ");
        printArray(ans);
        sc.close();
    }
}
