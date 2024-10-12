package Arrays;
public class q25_PrefixSumBruteForce {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int prefixSum[]=new int [arr.length];
        prefixSum[0]=arr[0];
        for (int i=1; i<arr.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("Prefix sum array of given array is: ");
        for (int value: prefixSum){
            System.out.print(value+" ");
        }
    }
}
