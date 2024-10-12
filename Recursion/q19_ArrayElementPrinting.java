package Recursion;
public class q19_ArrayElementPrinting {
    static void printArray(int arr[],int i){
        if (i==arr.length) return;
        printArray(arr,i+1);
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={8,16,24,32,40,48,56,64,72,80};
        printArray(arr,0);
    }
}
