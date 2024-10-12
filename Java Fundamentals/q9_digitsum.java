import java.util.*;
public class q9_digitsum {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s=0,r;
        while (n>0){
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("digit sum = "+s);    
    }
}
