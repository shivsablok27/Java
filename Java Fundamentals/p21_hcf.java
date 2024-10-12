import java.util.Scanner;
public class p21_hcf{
    public static int hcf(int n1, int n2){
        int n, hcf=1;
        n=n1<n2?n1:n2; // n is smaller of n1 and n2
        for (int i=2; i<=n; i++){
            if (n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main (String args[]){
        int n1,n2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number1: "); n1=sc.nextInt();
        System.out.print("Enter number2: "); n2=sc.nextInt();
        sc.close();
        if (n1>0 && n2>0){
            System.out.println("hcf= "+hcf(n1,n2));  
        }
        else{
            System.out.println("Invalid input");
        }
    }   
}

