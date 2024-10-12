/*
11  12  13  14
18  17  16  15
19  20  21  22
26  25  24  23
 */
import java.util.*;
class p29_zigzag_rectangle_pattern{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int co=11;
        for (int i=1; i<=r; i++){
            if (i%2!=0){
                for (int j=1; j<=r; j++){
                    System.out.print(co+"  ");
                    co++;
                }
                co=co+r-1;
            }
            else{
                for (int j=1; j<=r; j++){
                    System.out.print(co+"  ");
                    co--;
                }
                co=co+r+1;
            }
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}
