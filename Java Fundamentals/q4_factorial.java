import java.util.*;
public class q4_factorial {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print factorial: ");
        int n=sc.nextInt();
        System.out.print("Factorial of "+n+" i.e. ");
        int f=1;
        for (int i=n; i>=1; i--){
            System.out.print(i + " x ");
            f=f*i;
        }
        System.out.print(" = "+f + "\n");
    }
}
