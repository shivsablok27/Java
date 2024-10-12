import java.util.*;
public class q17_loop_mul_of_7 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            if (n%7==0){
                break;
            }
        }while (true);
    }
}
