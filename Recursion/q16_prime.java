package Recursion;
public class q16_prime {
    static boolean isPrime(int n, int i){
        if (n<=2) return (n==2)?true:false;
        if (n%i==0) return false;
        if (i > Math.sqrt(n)) return true;
        return isPrime(n,i+1);
    }
    public static void main(String[] args) {
        System.out.println(isPrime(45,2));
    }
}
