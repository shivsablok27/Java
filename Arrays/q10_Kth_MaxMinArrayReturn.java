/* Q10. WAP to input an array from user of desired size and then display an array
       containing its kth smallest and kth largest value, k be entered by user */ 
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class q10_Kth_MaxMinArrayReturn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]= new int [size];
        System.out.print("Enter array elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the value of k: ");
        int k= sc.nextInt();
        int req_array[]={arr[k-1],arr[arr.length-k]};
        System.out.printf("Array of %dth min and %dth max elemnt is: ",k,k);
        for (int i=0; i<req_array.length; i++){
            System.out.print(req_array[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
