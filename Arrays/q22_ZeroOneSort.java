// Q22. Sort an array containing only zeroes and ones in increasing order without built in 'sort' 
package Arrays;
public class q22_ZeroOneSort {
    static void sortArray(int arr[]){
        int n=arr.length, zeroes=0;
        for (int i=0; i<n; i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        for (int i=0; i<n; i++){
            if (i<=zeroes-1)
                arr[i]=0;
            else
                arr[i]=1;
        }
    }
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,0,0,1,0,1,0};
        sortArray(arr);
        printArray(arr);
    }
}
