/*
1 2 3 4
2 3 4 1
3 4 1 2
4 1 2 3
*/
import java.util.Scanner;
public class p23_rectangle_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the no. of rows: ");
        int r= sc.nextInt();
        for (int i=1; i<=r; i++){
            for (int j=i; j<=r; j++){
                System.out.print(j+" ");
            }
            for (int k=1; k<i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();        
    }
}
