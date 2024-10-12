package Recursion;
import java.util.ArrayList;
public class q23_searchAllIndex {
    static ArrayList<Integer> find_All_index(int arr[],int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx==arr.length) 
            return ans;
        if (arr[idx]==target) ans.add(idx);
        ArrayList<Integer> smallAns= find_All_index(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,12,7,12,10,14,12};
        ArrayList<Integer> ans =find_All_index(arr,12,0);
        System.out.println(ans);
    }
}
