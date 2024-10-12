import java.util.*;
public class q11_dec_to_bin {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number (deciaml: Base 10): ");
        int n=sc.nextInt();
        int p=1,sum=0;
        while (n>0){
            int r=n%2;
            sum=sum+p*r;
            p=p*10;
            n=n/2;
        }
        System.out.println(sum);   
    }
}
