package Recursion;
public class q20_ArrayMaxima {
    static int findMaxArray(int arr[],int i){
        if(i==arr.length) return 0;
        return Math.max(arr[i],findMaxArray(arr, i+1));
    }
    public static void main(String[] args) {
        int arr[]={8,16,40,24,32,80,64,72,73};
        System.out.println(findMaxArray(arr,0)); //Output: 80
    }
}
