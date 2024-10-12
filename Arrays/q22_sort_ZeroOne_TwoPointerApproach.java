package Arrays;
public class q22_sort_ZeroOne_TwoPointerApproach {
    static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,0,0,1,0,1,0};
        int n=arr.length, a=0, b=n-1;
        while (a<b){
            if (arr[a]==1 && arr[b]==0){
                swap(arr,a,b);
                a++; b--;
            }
            if (arr[a]==0)  a++;
            if (arr[b]==1)  b--;
        }
        printArray(arr);
    }
}
