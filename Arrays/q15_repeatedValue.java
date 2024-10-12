// Q15.Display the Last repeated value of the array, return -1 if no value is repeated.
package Arrays;
import java.util.Scanner;
public class q15_repeatedValue {
    static int repeating(int array[]){
        int n=array.length;
        for (int i=n-1; i>=0; i--){
            for (int j=i-1; j>=0; j--){
                if (array[i]==array[j]){
                    return array[i]; //break terminates particular iteration
                                     // and return terminates whole method
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Size of array: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Last Repeated value of the array = "+repeating(arr));
    sc.close();
    }
}