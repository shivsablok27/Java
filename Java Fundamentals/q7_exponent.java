import java.util.*;
public class q7_exponent {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the base(>0): ");
        int b=sc.nextInt();
        System.out.print("Enter the power(>0): ");
        int p=sc.nextInt();
        int mul=b;
        for (int i=1; i<p; i++){
            b=b*mul;
        }
        System.out.println(mul + " to the power " + p + " = " + b );
    }
}
