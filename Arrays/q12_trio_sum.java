// Q11. Find the total number of triplets in the array whose sum is equal to a given value.
package Arrays;
import java.util.*;
public class q12_trio_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int arr[]={1,2,4,6,0,8,7,5,3,9,16};
        System.out.println("Given Array:{1,2,4,6,0,8,7,5,3,9,16}");
        System.out.print("Enter the sum value: ");
        int sum= sc.nextInt();
        int co=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                for (int k=j+1; k<arr.length; k++)
                    if (arr[i]+arr[j]+arr[k]==sum){
                        co++;
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                }
            }
        }
        System.out.println("Hence "+co+" trio's exist");
        sc.close();
    }
}
