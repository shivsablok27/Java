package Arrays;
import java.util.*;
public class q16_missingterm_arrayInversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Range of series from 1 to : ");
        int n= sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter numbers from 1 to "+n+" with any one number missing: ");
        for (int i=0; i<n-1; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n-1; i++){
            if (arr[i]-1==i){
                arr[i]*=-1;
            }
            else{
                continue;
            }
        }
        int miss=0;
        loop: for (int i=0; i<n-1; i++){
            if (arr[i]>0){
                miss= i+1;
                break loop;
            }
        }
        System.out.println("Missing value= "+miss);
        sc.close();
    }
}
