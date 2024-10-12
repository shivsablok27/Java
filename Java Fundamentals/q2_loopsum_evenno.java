import java.util.*;
public class q2_loopsum_evenno {
    public static void main (String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter n1: ");
        int n1=sc.nextInt();
        System.out.print("Enter n2: ");
        int n2=sc.nextInt();
        if (n1%2==0){
            for (int i=n1; i<=n2; i+=2){
                System.out.print(i +" + ");
                sum=sum+i;
            }
            System.out.print(" = " +sum+ "\n");
        }
        else{
            for (int i=n1+1; i<=n2; i+=2){
                System.out.print(i +" + ");
                sum=sum+i;
            }
            System.out.print(" = " +sum+ "\n");
        } 
    }   
}
