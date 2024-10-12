// Find the m-th summation of first n natural numbers defined by the relation:
// If m>1 : sum(n,m) = sum(sum(n, m-1),1)
// Else:    sum(n,1) = sum of 1st n natural numbers.

package Recursion;
import java.util.*;
public class q12_Summation {
    public static int Summation(int n, int m){
        if (m==1) return sumOfFirst(n);
        return sumOfFirst(Summation(n, m-1));
    }
    public static int sumOfFirst(int n){
        if (n==0) return 0;
        return sumOfFirst(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n & m: ");
        int n= sc.nextInt(), m= sc.nextInt();
        int res=Summation(n,m);
        System.out.println("Required Result = "+res);
        sc.close();
    }
}
