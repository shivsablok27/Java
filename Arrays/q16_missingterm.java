// Find the missing number from an array of integers ranging 1 to n, size of array
// being n-1 as there is one missing term. Consider no duplicate values allowed.
package Arrays;
import java.util.Scanner;
public class q16_missingterm {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Range of series from 1 to : ");
        int n= sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter numbers from 1 to "+n+" with any one number missing: ");
        for (int i=0; i<n-1; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0; i<=n; i++){
            sum+=i;
        }
        for (int i=0; i<n-1;i++){
            sum=sum-arr[i];
        }
        System.out.println("Missing number is "+sum);
        sc.close();
    }
}
