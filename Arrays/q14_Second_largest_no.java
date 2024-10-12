//Q14. Find the second largest number of the array.
package Arrays;
public class q14_Second_largest_no {
    
    static int findmax(int arr[]){  
        int maximum=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (maximum<arr[i]){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,0,2,7,9,15,9,15,11};
        int max= findmax(arr); 
        for (int i=0; i<arr.length; i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int maxfinal= findmax(arr);
        System.out.println("Maximum value in Array is: "+maxfinal);
    }
}
