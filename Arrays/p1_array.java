package Arrays;
import java.util.*;
public class p1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        String arr[] =  new String [size];
        System.out.println(arr.length);
        for (int i=0; i<size; i++){
            System.out.printf("Enter the element %d: ",i+1);
            arr[i]= sc.next();
        }
        System.out.println("Array is sucessfully created.");
        System.out.println("It is stored at memory location: "+ arr);
        System.out.println();
        System.out.print("Array formed is: arr = [");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]);
            if (i!=(size-1)){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
        for (int i=0; i<size; i++){
            System.out.printf("\n arr[%d] i.e. Index %d has value: %s",i,i,arr[i]);
        }
        System.out.println();
        sc.close();
    }
}