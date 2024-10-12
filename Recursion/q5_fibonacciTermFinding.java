package Recursion;
import java.util.*;
public class q5_fibonacciTermFinding {
    static int fib(int t){
        if (t==0 || t==1){       //Base case
            return t;
        }  
        int prev  = fib(t-1);
        int prev2 = fib(t-2); 
        return prev + prev2;     //Recurrence Relation
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Considering that fibonacci series starts with zeroth term");
        System.out.print("Which term of series is to be searched?: "); 
        int n= sc.nextInt();
        int result = fib(n);
        System.out.println("Value of searched term is "+result);
        sc.close();
    }
}
