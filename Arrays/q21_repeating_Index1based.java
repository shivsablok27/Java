// Q21. Find the index of first repeating value of array by using 1 based indexing convention.
package Arrays;
class q21_repeating_Index1based{
    public static void main(String[] args){
        int arr[]={1,5,3,4,0,-1,6}; int x=0;
        loop: for (int i=1; i<=arr.length; i++){
              for (int j=i+1; j<=arr.length; j++){
                   if (arr[i-1]==arr[j-1]){
                        x=i;
                       break loop; }
                   else{
                        x=-1;
                    }
              }}
        System.out.println("Acc. to 1 based indexing, index of 1st repeating value is: "+x);
    }
}