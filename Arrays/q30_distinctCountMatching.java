/*
 Q30. Given an integer m, and n integers, 
 return true if the number of unique integers among the n integers 
 is greater than or equal to m, else return false. 
 (Integers appearing multiple times are all considered as 1 unique integer)
 */
package Arrays;
import java.util.*;
public class q30_distinctCountMatching {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter distinct count to be matched: ");
        int m= sc.nextInt();
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]= new int [n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while(i < n){
            count++;
            while(i < n-1 && arr[i+1] == arr[i]){
                i++;
            }
            i++; 
        }
        System.out.println("Distinct count found = "+ count);
        if (count>=m)  System.out.println(true);
        else            System.out.println(false);
    sc.close();
    }   
}
