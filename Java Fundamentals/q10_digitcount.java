import java.util.*;
public class q10_digitcount {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        while (n>0){
           n=n/10;
           count=count+1;
        }
        System.out.println(count);
    }
}
