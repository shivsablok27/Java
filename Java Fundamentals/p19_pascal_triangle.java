import java.util.*;
public class p19_pascal_triangle {
    public static int factorial(int n){
        int f=1;
        for (int i=n; i>=1; i--){
            f=f*i;
        }
        return f;
    }

    public static int combination(int n, int r){
        int nCr = factorial(n)/(factorial(r)*factorial (n-r));
        return nCr;
    }

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for pascal triangle: ");
        int n= sc.nextInt();
        for (int i=0; i<=n-1; i++){
            for (int s=i; s<=n-2; s++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
    sc.close(); }
}
