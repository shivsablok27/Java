// x - x^2/2! + x^3/3! - x^4/4! + x^5/5! - ...... x^n/n!
import java.util.*;
public class q19_Series2 {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        int x,n, sign=1, f=1; double result=0.0;
        System.out.print("Enter the value of x: ");
        x=sc.nextInt();
        System.out.print("Enter the value of n: "); 
        n=sc.nextInt();

        for (int i=1; i<=n; i++){
            result = result + (Math.pow(x,i)/(f*i))*sign;
            sign = sign*-1;  
            f=f*i;
        }
        System.out.println("Result = "+ result);
    }
}
