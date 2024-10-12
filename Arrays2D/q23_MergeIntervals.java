// Given an array of intervals[i] [starti, endi], 
// merge all overlapping intervals, 
// and return the count of the non-overlapping intervals 
// that cover all the intervals in the input...
package Arrays2D;
import java.util.*;
public class q23_MergeIntervals {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter rows and columns of matrix: ");
        int r= sc.nextInt(); int c=sc.nextInt();
        int matrix[][]= Matrix.create(r,c);
        //lambda expression for comparing
        Arrays.sort(matrix, (arr1,arr2) -> arr1[0]-arr2[0]); 
        ArrayList<Integer>intervals = new ArrayList<>();
    } 
}
