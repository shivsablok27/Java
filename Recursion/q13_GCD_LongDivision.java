package Recursion;
public class q13_GCD_LongDivision {
    static int gcd(int a, int b){
        while (a%b != 0){
            int r =a%b;
            a=b;
            b=r;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,16)); // Commutative property holds good 
    }
}
