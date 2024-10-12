import java.util.Scanner;
public class p22_ASCIIcode {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the character: ");
        char ch= sc.next().charAt(0);
        int n= (int) ch;
        System.out.println("character "+ch+" has ASCII value = "+n);
        for (char i='A'; i<='Z'; i++){
            System.out.println(i+" "+(int)i);
        }
        sc.close();
    }   
}

