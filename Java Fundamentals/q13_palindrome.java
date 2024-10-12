import java.util.*;
public class q13_palindrome {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int original=n,s=0,r;
        while (n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if (original==s){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
