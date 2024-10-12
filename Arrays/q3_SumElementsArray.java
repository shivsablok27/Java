// Q3. WAP to print the sum of array elements.
package Arrays;
public class q3_SumElementsArray {
    public static void main(String[] args) {
        int arr[]={2,3,45,6}; // 2 + 3 + 45 + 6 = 56
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements of array= "+ sum);
    }
}
