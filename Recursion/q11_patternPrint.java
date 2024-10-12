// n  n-5  n-10  ....0  5  10 .... n-10  n-5  n
// 20 15 10 5 0 5 10 15 20 (for n=20)
package Recursion;
import java.util.*;
public class q11_patternPrint {
    static void printPattern(int n){
        if(n
        <=0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printPattern(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive n: ");
        int n=sc.nextInt();
        if (n>0) printPattern(n);
        sc.close();
    }
}
