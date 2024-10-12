// Q34. WAP to modify the array values with its factorial values and display the modified Array.
package Arrays;
public class q34_factorialArray {
    static int factorial(int value){
		int f=1;
		for (int j=1; j<=value; j++){
			f=f*j;
		}
		return f;
	}
	public static void main(String args[]) {
		int arr[]= {4,5,6,3,4};
		int indexOfArray=0;
		for (int elementOfArray: arr){
			arr[indexOfArray++]=factorial(elementOfArray);
		}
		for (int elementOfArray: arr){
			System.out.print(elementOfArray+" ");
		}
	}
}
