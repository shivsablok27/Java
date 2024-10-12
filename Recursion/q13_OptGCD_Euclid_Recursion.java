package Recursion;
public class q13_OptGCD_Euclid_Recursion {
    public static int GCD(int a, int b){
        if (b==0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(GCD(24,15));
    }
}
