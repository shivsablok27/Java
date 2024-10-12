package Arrays;
public class q17_arrayReverse_approach3 {
    static void reverse(int arr[]){
        int i=0, j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++; j--;
        }
    }
    static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        reverse(arr);
        print (arr);
    }
}
