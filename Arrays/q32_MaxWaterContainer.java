/*
Q32. You are given an integer array of heights. 
There are n (length of array) vertical lines drawn such that 
the two endpoints of the ith line are (i, 0) and (i, height[i]). 
Find two lines that together with the x-axis form a container, 
such that the container contains the most water. 
Return the maximum amount of water a container can store.
 */
package Arrays;
public class q32_MaxWaterContainer {
    static int max_Water_Area_Calcu(int[]arr, int n){
        int a=0, b=n-1, max=0;
        // Math.min(arr[a],arr[b]) is the height and (b-a) is the base
        while (a<b){
            int area= Math.min(arr[a], arr[b])*(b-a);
            if (area>max) max=area;
            if (Math.min(arr[a], arr[b])==arr[a]) a++;
            else b--;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]= {1,8,6,2,5,4,8,3,7};
        int maxAmountWater= max_Water_Area_Calcu(arr, arr.length);
        System.out.println("Maximum amount of water container can store= "+maxAmountWater);
    }
}
