//Q13. Find the once occured elements out of the doubly occured elements in a given array.
package Arrays;
public class q13_unique_in_doubles {
    public static void main(String[] args) {
        int arr[]={-2,-2,-3,1,2,3,4,4,3,5,6,1,2,7,5,10};
        System.out.println("Given array: {-2,-2,-3,1,2,3,4,4,3,5,6,1,2,7,5,10}" );
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[i]=0;
                    arr[j]=0;
                }}}
        System.out.print("Unique elements are: ");
        for (int value: arr){
            if (value!=0)
                System.out.print(value+" ");
            }}}
