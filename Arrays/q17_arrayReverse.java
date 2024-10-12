//Q17. Display the array in reversed order.
package Arrays;
public class q17_arrayReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int length= arr.length;
        int length_minus_1= length-1;
        int half_length= length/2;
        int temp=0;
        for (int i=0; i<half_length;i++){
            temp=arr[i];
            arr[i]=arr[length_minus_1];
            arr[length_minus_1]=temp;
            length_minus_1--;
        }
        for (int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
