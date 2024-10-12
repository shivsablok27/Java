import java.util.*;
public class p20_count_no_of_pnz{
    public static void main (String args[]){
        int cop=0,con=0, coz=0,n; String choice;
        Scanner sc = new Scanner (System.in) ;
            do{
                System.out.print("Enter number: "); n=sc.nextInt();
                System.out.print("Want more? y/n: "); choice=sc.next();
                if (n==0){
                    coz++;
                }
                else if (n>0){
                    cop++;
                }
                else{
                    con++;
                }
            } while (choice.equals("y"));
         
        System.out.println("count of positives = "+ cop); 
        System.out.println("count of negatives = "+ con); 
        System.out.println("count of zeros = "+ coz); 
        sc.close();
    }
}

