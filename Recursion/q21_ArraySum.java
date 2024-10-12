package Recursion;
public class q21_ArraySum {
    static int arraySum(int arr[], int i, int n){
        if (i==n) return 0;
        return arr[i] + arraySum(arr,i+1,n);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(arraySum(arr,0,arr.length));   // Output: 55
    }                                                       // Time & Space O(n)
}
