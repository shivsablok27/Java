package Arrays;
public class SortInsertion {
    public static void main(String[] args) {
        int arr[]={6,7,3,1,2,4,5};
        int n=arr.length;
        for (int i=1; i<n; i++){
            int t=arr[i];
            int p=i-1;
            while (p>=0 && t<arr[p]){
                arr[p+1]=arr[p];
                p--;
            }
            arr[p+1]=t;
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
