package Arrays;
public class q25_PrefixSumInPlace {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        for (int i=1; i<arr.length; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println("Prefix sum array of given array is: ");
        for (int value: arr){
            System.out.print(value+" ");
        }
    }
}
