package Recursion;
import java.util.*;
public class q3_factorial {
    public static int factorial(int n){
        if(n==1)  return 1;       // Base Case or Halting Condition
        return n*factorial(n-1);  // Recurrence Realtion
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the number = ");
        int n= sc.nextInt();
        System.out.println("Factorial = " + factorial(n));
        sc.close();
    }
}
