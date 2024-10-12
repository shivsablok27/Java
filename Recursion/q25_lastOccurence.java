package Recursion;
public class q25_lastOccurence {
    static int findLast(int arr[], int target, int idx){
        if (idx==arr.length) return -1;
        int nextIndex= findLast(arr, target, idx+1);
        if (arr[idx]==target && nextIndex==-1) return idx;
        return nextIndex;
    }
    public static void main(String[] args) {
        int arr[]={23,24,25,23,12,24,23,52,97};
        System.out.println(findLast(arr, 23, 0));
    }
}
