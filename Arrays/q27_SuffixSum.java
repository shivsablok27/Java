package Arrays;
public class q27_SuffixSum {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        for (int i=arr.length-2; i>=0; i--){
            arr[i]+=arr[i+1];
        }
        System.out.println("Suffix Sum Array of given array 'arr' is");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
