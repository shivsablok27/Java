package Recursion;
import java.util.*;
public class q7_digitCount {
    static int digitCount(int n){
        if (n<10) return 1; 
        return digitCount(n/10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a positive number: "); int n= sc.nextInt();
        System.out.println("Number of digits is "+digitCount(n));
        sc.close();
    }
}
