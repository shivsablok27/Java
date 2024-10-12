import java.util.*;
public class q14_quadraticeq {
    public static void main (String[] args){
        double a;
        Scanner sc= new Scanner (System.in);
        for ( ; ; ){
            System.out.print("Enter a: ");
            a = sc.nextDouble();
            if (a!=0){
                break;
            }
                else{
                System.out.println("Value of a should not be zero");
            }   
        }
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.println("Quadratic equation: ("+a+")x^2 + ("+b+")x + ("+c+") =0");
        double D = ((b*b)-(4*a*c));
        if (D>0){
            double ans1=((-b+ Math.pow(D,0.5))/(2*a));
            double ans2=((-b- Math.pow(D,0.5))/(2*a));
            System.out.println("Roots = "+ans1+" and "+ans2);
        }
        else if (D==0){
            double r=(-b/(2*a));
            System.out.println("Root = "+r);
        }
        else{
            System.out.println("No real root exist");
        }
    }
}

        