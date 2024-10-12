
import java.util.*;
public class p4_conditions{
    public static void main (String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            if (age>=18){
                System.out.println("You are eligible to give vote");}
            else{
                System.out.println("You are not eligible to give vote ");}
        }  
    }
}
