import java.util.*;
public class p10_ternarygreatest {
    public static void main (String [] args){
        int a,b,c,temp,largest;
        try (Scanner sc = new Scanner (System.in)) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
        }
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println(largest+" is Largest");         
    }
}
