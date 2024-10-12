package Recursion;
import java.util.Scanner;
public class q15_multiply {
    static int intMultiply(int a, int b){
        if (a==0 || b==0) return 0;        
        if (a<0 && b>0) return intMultiply(b,a);
        if (a<0 && b<0) return intMultiply(Math.abs(a), Math.abs(b));
        return intMultiply(a-1,b)+b; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        for (int i=1; i<=5; i++){
            int a= sc.nextInt(); 
            int b= sc.nextInt();        
            System.out.println(intMultiply(a,b));
        }
        sc.close();
    }
}
