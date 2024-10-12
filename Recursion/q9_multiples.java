package Recursion;
import java.util.*;
public class q9_multiples {
    static void multiples(int num, int k){
        if (k==0) return;
        multiples(num,k-1);
        System.out.print(num*k + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'num' & 'k': ");
        int num= sc.nextInt(), k=sc.nextInt();
        multiples(num,k);
        sc.close();
    }
}
