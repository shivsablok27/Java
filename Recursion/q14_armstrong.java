package Recursion;
public class q14_armstrong {
    public static double armstrongSum(int n, int co){
        if (n==0) return 0;
        return armstrongSum(n/10,co) + Math.pow(n%10,co);
    }
    public static void main(String[] args) {
        int n=371,co=0, n1=n;
        do{ co++; n/=10; }while(n!=0);      //direct formula: co=floor(log10(N))+1
        double sum = armstrongSum(n1,co);
        System.out.println(n1==sum);        // true
    }                                       // Time Complexity O(co)
}
