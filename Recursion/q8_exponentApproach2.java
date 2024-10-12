package Recursion;
import java.util.*;
public class q8_exponentApproach2 {
    public static int exponent(int p, int q){
        if (q==0) return 1;                     //base case
        int smallPower = exponent(p,q/2);
        if (q%2==0){                            //even power
            return smallPower*smallPower;
        }
        return smallPower*smallPower*p;         //odd power
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base & Power: ");
        int p= sc.nextInt(), q= sc.nextInt();
        System.out.println(p+" to the power "+q+" is: "+ exponent(p, q));
        sc.close();
    }
}
