package Recursion;
import java.util.*;
public class q4_fibonacciSeries {
    static int fib(int i){
        if (i==1) return 0;         //Base case
        if (i==2) return 1;        //Base case
        return fib(i-1)+fib(i-2); //Recurrence Relation
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter number of terms: "); 
        int n= sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print(fib(i)+" ");
        }
        sc.close();
    }
}
