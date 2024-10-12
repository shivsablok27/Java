/* Q24.
Consider an array containing of positive and negative numbers. 
Write a code to arrange the array in such a way that it starts with 
a negative number, and continues a negative- positive alternate fashion. 
If number of positive and negative numbers are not equal, 
then the extra number(s) may occur at the end of the array.
Sample input
-1  2  4  -5  6  -3  -8  10  11  13
Sample output
-1  2  -5  4  -3  6  -8  10  11  13
 */
package Arrays;
public class q24_positiveNegativeArrangement {
    static void swapArray(int[]arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void printArray(int[] arr) {
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,4,-5,-8,6,8,10};
        int n=arr.length, a=0, b=n-1;
        //If array is to be started from -ve, then firstly arrangemnt will
        // be such that +ve elements are placed before -ve (based on dry run)
        while (a<b){
            if (arr[a]<0 && arr[b]>0){
                swapArray(arr,a,b);
                a++; b--;
            }
            if (arr[a]>0 && arr[b]>0){
                swapArray(arr,a,b);
                a++;
            }
            if (arr[a]>0){
                a++;
            }
            if (arr[b]<0){
                b--;
            }
        
        } // Dry run is required for better understanding especially after this
        System.out.println("a="+a);
        printArray(arr);
        int k=0;
        while(k<n && a<n){
            swapArray(arr,k,a);
            k=k+2; a++;
        }
        System.out.println("Required Arranged Array is:");
        printArray(arr);
    }
}
