// Q2. Input an array and check whether it is sorted in increasing order or not.
package Arrays;
import java.util.*;
public class q2_CheckSortArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Size: ");
        int size=sc.nextInt(); //input size of array
        int arr[]=new int[size];
        System.out.printf("Enter %d integral elements: ", size);
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt(); //input elements of array
        }
        int f=1; //ascending condition considered true in starting
        for (int i=0; i<size-1; i++){
            if (arr[i]>arr[i+1]){ //if ascending condition becomes flase
                f=0;
                break;
            }
        }
        if (f==1)
            System.out.println("Array is sorted in ascending order");
        else
            System.out.println("Array is not sorted in ascending order");
    sc.close();
    }
}
