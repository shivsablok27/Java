package Recursion;
import java.util.*;
public class q2_print_n_to_1 {
    public static void printDecreasing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
}
