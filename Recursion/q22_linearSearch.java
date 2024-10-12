package Recursion;
public class q22_linearSearch {
    static String search(int arr[],int target,int idx){
        if (idx==arr.length) return "No";
        if (arr[idx]==target) return "Yes";
        return search(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,9,10,14,12};
        System.out.println(search(arr,18,0));
    }
}
