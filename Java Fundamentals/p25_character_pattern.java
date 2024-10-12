import java.util.Scanner;
public class p25_character_pattern{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        for (int i=1; i<=row; i++){
            for (int space=1; space<=row-i; space++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char)('A'+j-1));
            }
            for (int k=i; k>1; k--){
                System.out.print((char)('A'+k-2));
            }
            System.out.println();
        }
        sc.close();
    }
}
