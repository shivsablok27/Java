// Q4. Construct and array, search for a value and return its index.
package Arrays;
import java.util.*;
public class q4_valueSearchIndexReturn {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Size: ");
        int size= sc.nextInt();
        int arr[] = new int [size];
        System.out.printf("Enter %d integral elements: ",size);
        for (int i=0; i<size; i++){
           arr[i]= sc.nextInt(); 
        }
        System.out.print("Enter value whose index is to be searched: ");
        int x=sc.nextInt();
        for (int i=0; i<size; i++){
            if (x==arr[i]){
                System.out.println("Value found at index: "+i);
                break;
            }
        }
        sc.close();
    }
}
