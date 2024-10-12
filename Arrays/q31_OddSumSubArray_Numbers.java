/*
Q31. Calculate total number of sub-arrays with odd sum.
If Sample input: {1,2,3,4,5} 
Odd-Sum Sub-Arrays: {1},{1,2},{1,2,3,4,5},{2,3},{2,3,4},{3},{3,4},{4,5},{5}
Then Sample output: 9
*/

package Arrays;
public class q31_OddSumSubArray_Numbers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; int n=arr.length;
        int count=0;
        for (int i=0; i<n; i++){
            int sum=0;
            for (int j=i; j<n; j++){
                sum=sum+arr[j]; //Prefix Sum is being calculated and checked
                                //Effective understanding from dry run
                if (sum%2==1){  
                    count++;
                }
            }
        } 
        System.out.println("Number of Sub-Arrays with odd sum = "+count);
    }
}
