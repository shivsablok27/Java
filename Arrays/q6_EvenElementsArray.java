// Q6. Print only the even elements of array using 'for each' loop.
package Arrays;
public class q6_EvenElementsArray {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Even Elements in the array are: ");
        for (int value: array){
            if (value%2==0)
                System.out.print(value+"   ");
        }
    }
}
