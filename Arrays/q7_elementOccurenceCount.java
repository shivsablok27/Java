//Q7. WAP to find out the number of occurences of an element in an array.
package Arrays;
import java.util.*;
public class q7_elementOccurenceCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,4,3,3,9,10,11,19,20,20,1,2};
        Scanner sc=new Scanner (System.in);
        System.out.print("Search number of occurences of? : ");
        int x=sc.nextInt();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                System.out.print("At Index "+i+", ");
                count++;
            }
        }
        System.out.printf("\nTotally, %d is found %d time(s)\n",x,count);
        sc.close();
    }
}
