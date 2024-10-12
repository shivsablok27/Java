import java.util.*;
public class q6_prime_or_not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number greater than 1: ");
        int n = sc.nextInt();
        int f=0;
        for (int i=2; i<n; i++){
            if (n%i==0){
                f=1;
                break;
            }
        }
        if (f==0){
            System.out.println("It is prime number");
        }
        else{ 
            System.out.println("It is composite number"); 
        }
        
    }
}
