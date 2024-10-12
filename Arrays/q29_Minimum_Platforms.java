// Q29. Minimum number of platforms to avoid overlapping of trains.
package Arrays;
import java.util.*;
public class q29_Minimum_Platforms {
    static int minimumPlatform(int[] arrival, int[] departure,int t){
        int i=1, j=0, ans=1, count=1;
        Arrays.sort(departure);
        while (i<t && j<t){
            if (arrival[i]<=departure[j]){
                count++; i++;
                ans=Math.max(count, ans);
            }
            else{
                count--; j++;
            }
        }
        return ans;       
    }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter number of trains: "); 
        int t=sc.nextInt();
        int arrival[]= new int [t];
        int departure[]= new int [t];
        for (int i=0; i<t; i++){           
            System.out.println("Enter arrival and departure time of train "+(i+1));
            arrival[i]=sc.nextInt();
            departure[i]=sc.nextInt();
        }
        int ans= minimumPlatform(arrival, departure,t);
        System.out.println("The minimum number of platforms required ="+ans);
        sc.close();
    }
}
