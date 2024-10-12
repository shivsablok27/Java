package Arrays;
public class SortSelection {
    public static void main(String[] args) {
        int arr[]={6,7,3,1,2,4,5};
        int n=arr.length;
        for (int i=0; i<n; i++){
            int smallest=i;
            for (int j=i+1; j<n; j++){
                if (arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
