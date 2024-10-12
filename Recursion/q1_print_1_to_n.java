package Recursion;
import java.util.*;
public class q1_print_1_to_n {
    public static void printIncreasing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printIncreasing(n); 
        sc.close();
    }
}
