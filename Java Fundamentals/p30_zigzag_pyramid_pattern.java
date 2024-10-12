/*
      11
    13  12
  14  15  16
20  19  18  17
 */
import java.util.*;
class p30_zigzag_pyramid_pattern{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int co=11;
        for (int i=1; i<=r; i++){
            for (int space=1; space<=r-i; space++){
                System.out.print("  ");
            }
            if (i%2!=0){
                for (int j=1; j<=i; j++){
                    System.out.print(co+"  ");
                    co++;
                }
                co=co+i;
            }
            else{
                for (int j=1; j<=i; j++){
                    System.out.print(co+"  ");
                    co--;
                }
                co=co+i+1;
            }
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}
