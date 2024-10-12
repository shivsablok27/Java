
import java.util.*;
public class p5_oddeven{
    public static void main (String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the number: ");
            int num=sc.nextInt();
            if (num%2==0){
                System.out.println("Even Number! ");}
            else{
                System.out.println("Odd Number!");}
        }  
    }
}
