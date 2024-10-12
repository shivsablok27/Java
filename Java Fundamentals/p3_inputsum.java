import java.util.*;
public class p3_inputsum {
    public static void main (String args[]){
        try (Scanner object = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a =object.nextInt();
            System.out.print("Enter second number: ");
            int b =object.nextInt();
            int sum = a+b;
            System.out.println("Sum of two numbers= "+sum);
        }   
    }
    
}
