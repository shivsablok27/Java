import java.util.*;
public class q3_table {
    public static void main (String args[]){
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print table: ");
        n=sc.nextInt();
        while (i<=10){
            System.out.println(n+ " x " +i+ " = "+ n*i);
            i++;
        }
    }
}
