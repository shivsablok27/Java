import java.util.*;
public class q16_loopsum_till_no {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int s=0,n, choice;
        System.out.print("Enter number: ");
        int n1= sc.nextInt();
        do{
            System.out.print("Enter number: ");
            n = sc.nextInt();
            s=s+n;
            System.out.print("Enter 1 if you want to continue: ");
            choice=sc.nextInt();
        } while(choice==1);
        System.out.println("Sum = "+(s+n1)); 
    }
}