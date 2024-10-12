/* Q9. WAP to input an array and return an array containing only the smallest
and largest element of the inputted array. Use concepts of methods for 
every single operation in such a way that only one method is called from 
main method and then further method calls other method and so on. */ 
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class q9_MaxMinArrayReturn {
    static Scanner sc= new Scanner(System.in);
    static void sizeArray(){
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]= new int [size];
        inputArray(arr);
    }
    static void inputArray(int array[]){
        System.out.print("Enter array elements: ");
        for (int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int arr2[]=requiredArray(array);
        printArray(arr2);
    }
    static int[] requiredArray(int array[]){
        Arrays.sort(array);
        int req_array[]={array[0],array[array.length-1]};
        return req_array;
    }
    static void printArray(int array[]){
        System.out.print("Array of min and max elemnts is: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        sizeArray();
    }
}
