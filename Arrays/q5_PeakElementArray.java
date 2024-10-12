// Q5. WAP to print peak elements of an array.
package Arrays;
public class q5_PeakElementArray {
    public static void main(String[] args) {
        int arr[] = {2,4,3,9,7,10,11,12,14,99,0};
        System.out.println("The peak elements are: ");
        for (int i=1; i<arr.length-1; i++){
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
