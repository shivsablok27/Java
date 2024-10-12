import java.util.*;
public class q8_reverse_number {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int s=0,r;
        while (n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("Reversed number: "+s);
    }
}
