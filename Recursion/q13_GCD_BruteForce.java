package Recursion;
public class q13_GCD_BruteForce {
    static int gcd(int a, int b){
        int hcf=1, min=Math.min(a,b);
        for (int i=2; i<=min; i++){
            if (a%i==0 && b%i==0)
                hcf=i;   
        }
        return hcf;
    }
    public static void main(String[] args){
        System.out.println(gcd(12,16));
    }
}


