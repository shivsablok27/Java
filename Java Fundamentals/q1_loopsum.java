import java.util.*;
public class q1_loopsum {
    public static void main (String args[]){
        int sum=0, n;
        System.out.print("Sum of first n natural numbers, where n= ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1; i<=n; i++){
            sum=sum+i;
            System.out.print(i+ " + ");
        }
        System.out.print(" = "+sum+ "\n");
    }
}
