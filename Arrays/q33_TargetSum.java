/*
Q33.Given a 1-indexed array of integers numbers that is already sorted in 
non-decreasing order, find two numbers such that they add up to a specific 
target number. Return the indices of the two numbers. 
Return -1 if pair does not exist.
*/   
package Arrays;
public class q33_TargetSum {
    public static void main(String[] args) {
        /*Consider the Array*/ int arr[]={1,2,7,8,11,15};
        /*Consider the target Sum*/ int tsum = 9;
        int a=0, b=arr.length-1, f=0; //f=0 means considering no pair exists
        while (a<b){
            if (arr[a]+arr[b] ==tsum){
                System.out.println((a+1) +" "+ (b+1));
                f=1; a++; b--;
            }
            else if (arr[a]+arr[b]>tsum)   b--;
            else if (arr[a]+arr[b] <tsum)  a++;
        }
        if (f==0) System.out.println(-1); //no pair exist
    }
}
