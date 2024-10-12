import java.util.*;
import java.math.BigInteger;
public class p38_BigInteger_factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter number to calculate factorial: ");
        int num=sc.nextInt();
        BigInteger f= BigInteger.ONE;
        for (int i=num; i>=1;i--){
            f=f.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("factorial of %d is %d\n",num,f);
        sc.close();
}}
