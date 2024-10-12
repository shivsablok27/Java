// Q1. WAP to find the minimum and maximum values from the array of Integers.
package Arrays;
public class q1_MinMaxArray {
    public static void main(String[] args) {        
        int arr[]={28,32,86,85,92,22,16};
        int min= arr[0];
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min and Max integer of array are "+min + " & "+max);
    }
}
