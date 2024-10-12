package Arrays;
public class q17_arrayReverse_approach2 {
   public static void main(String[] args) {
        int arr[]={12,13,14,15,16,17,18,19,20,21,22};
        int n= arr.length;
        int ans[]= new int[n];
        int j=0;
        for (int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        System.out.print("Reversed array is : ");
        for (int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
   } 
}
