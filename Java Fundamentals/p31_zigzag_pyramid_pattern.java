/*  
               11
           14  13  12
       15  16  17  18  19
   26  25  24  23  22  21  20
27 28  29  30  31  32  33  34  35
*/
import java.util.*;
class p31_zigzag_pyramid_pattern{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r= sc.nextInt();
        int co=11;
        int n1=1;
        int n2=2;
        for (int i=1; i<=r; i++){
            for (int space=1; space<=r-i; space++){
                System.out.print("    ");
            }
            if (i%2!=0){
                for (int j=1; j<=2*i-1; j++){
                    System.out.print(co+"  ");
                    co++;
                }
                co=co+i+n1; // add 1,3,5,....
                n1+=2;
            }
            else{
                for (int j=1; j<=2*i-1; j++){
                    System.out.print(co+"  ");
                    co--;
                }
                co=co+i+n2; // add 2,4,6,...
                n2+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
