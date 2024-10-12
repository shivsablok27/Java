package Recursion;
public class q32_arraySubsetsSum {
    public static void getSubsetSum(int arr[], int idx, int sum){
        if (idx>=arr.length){
            System.out.print(sum+" ");
            return;
        }
        getSubsetSum(arr, idx+1, sum+arr[idx]); // Inclusion
        getSubsetSum(arr, idx+1, sum);          // Exclusion
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        getSubsetSum(arr, 0, 0);;
    }
}
