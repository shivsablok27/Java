/*
Q26.Given an array arr of a fixed size. Answer q queries where you need to 
print the sum of values in the give range of indices from l to r both 
inclusive. The values of l and r in the query must follow 1 based indexing.
*/ 
package Arrays;
import java.util.Scanner;
public class q26_rangeSum_queries_prefixSumApproach {
    static int prefixSum (int arr[], int index){
        int sum=0;
        for (int i=0; i<index; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter number of queries: ");
        int q=sc.nextInt();
        while (q-->0){
            System.out.print("Enter index l and r: ");
            int l =sc.nextInt(), r=sc.nextInt();
            int sum=prefixSum(arr,r)-prefixSum(arr,l-1); // 0 based r and l
            //int sum=prefixSum(arr,r-1)-prefixSum(arr,l-2); // 1 based r and l
            System.out.println("Sum= "+sum);
            }
        sc.close();
    }
}
