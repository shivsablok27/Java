//Q8. WAP to print last occurence of an element in the array. 
package Arrays;
import java.util.Scanner;
public class q8_lastoccurence {
    public static void main(String[] args) {
        int [] arr= {1,2,3,1,4,5,1,2,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Last occurence of ");
        int x=sc.nextInt();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==x){
                count=i;
            }
        } 
        System.out.println("is at index number "+count);
        sc.close();
    }
}
