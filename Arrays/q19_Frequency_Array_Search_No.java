/* 
Q19. Check if the number is present in an array or not. In case, it is present
display the number of occurences. Perform this operation on an array for q number
queries. Note: Value of all elements in the array be less than 10^5.
*/
package Arrays;
import java.util.*;
public class q19_Frequency_Array_Search_No {
    static int[] frequencyArray(int arr[]){
        int n=arr.length;
        int freq_arr[] =new int [100001];
        for (int i=0; i<n; i++){
            freq_arr[arr[i]]++;
        }
        return freq_arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=frequencyArray(arr);
        System.out.print("Enter number of queries: ");
        int q=sc.nextInt();
        while (q>0){
            System.out.print("Enter number to be searched: ");
            int x=sc.nextInt();
            if (freq[x]>0){
                System.out.println("PRESENT: Occurence = "+freq[x]+" times");
            }
            else{
                System.out.println("ABSENT");
            }
            q--;
        }
        sc.close();

    }
}
