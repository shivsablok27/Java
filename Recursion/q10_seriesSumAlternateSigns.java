//series :  1-2+3-4+5-6+........n
package Recursion;
import java.util.*;
public class q10_seriesSumAlternateSigns {
    public static int seriesSum(int n){
        if (n==0)   return 0;
        if (n%2==0) return seriesSum(n-1)-n;
        return seriesSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println(seriesSum(n));
        sc.close();
    }
}
