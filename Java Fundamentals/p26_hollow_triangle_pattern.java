import java.util.Scanner;
public class p26_hollow_triangle_pattern {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        for (int i=1; i<=r; i++){
            for (int s=1; s<=r-i; s++){
                System.out.print(" ");
            }
            if (i==1|| i==r){
                for (int j=1; j<=2*i-1; j++){
                    System.out.print(i);
                }
            }
            else{
                for (int j=1; j<=2*i-1;j++){
                    if (j==1|| j==2*i-1){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }            
            System.out.println();
        sc.close();
        }
    }
}
