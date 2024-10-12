package Recursion;
import java.util.*;
public class q8_exponent {
    public static int exponent(int p, int q){
        if (q==0) return 1;       // Halting condition
        return exponent(p,q-1)*p; // Recurrence Relation
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Base & Power: ");
    int p= sc.nextInt(), q= sc.nextInt();
    System.out.println(p+" to the power "+q+" is: "+exponent(p, q));
    sc.close();
    }
}
