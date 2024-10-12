package Recursion;
public class q29_integerPalindromeCheck {
    static int reverse(int n, int co){
        if (n==0) return 0;
        return (n%10)*(int)(Math.pow(10, co-1)) + reverse(n/10,co-1);
    }
    public static void main(String args[]){
        int n= 123421;
        int co= (int)Math.log10(n)+1;
        int reverse= reverse(n,co);
        System.out.println(reverse==n);
    }
}
