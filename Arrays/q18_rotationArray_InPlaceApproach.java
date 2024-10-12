package Arrays;
import java.util.*;
public class q18_rotationArray_InPlaceApproach {
    static void rotateArray(char arr[], int k){
        int n= arr.length; 
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }
    static void reverseArray(char arr[], int start, int end){
        while(start<end){
            swapArray(arr,start,end);
            start++; end--;
        }
    }
    static void swapArray(char arr[], int start, int end){
        char temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void printArray(char arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.print("Number of steps by which array is to be rotated: ");
        int k = sc.nextInt(); 
        rotateArray(arr, k);
        System.out.println("Rotated Array by "+k+" steps is: ");
        printArray(arr);
        sc.close();
    }
}
