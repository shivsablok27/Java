import java.util.*;
public class q12_bin_to_dec {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number (binary: Base 2): ");
        int n=sc.nextInt();
        int p=1,sum=0;
        while (n>0){
            int r=n%10;
            sum=sum+p*r;
            p=p*2;
            n=n/10;
        }
        System.out.println(sum);   
    }
}
