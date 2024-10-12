import java.util.Scanner;
public class q15_armstrong {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            int sum=0; int count=0; int temp=i; int temp2=i;
            do{
                count++;
                temp2/=10;
            }while (temp2>0);
            
            while (temp>0){
                int r=temp%10;
                sum+=Math.pow(r,count);
                temp/=10;
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }   
}
