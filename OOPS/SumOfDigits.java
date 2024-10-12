package OOPS;
import java.util.Scanner;
class Calculation{
    int number;
    void sumofdigits(){
        int s=0,r;
        while(number>0){
            r = number%10;
            s = s+r;
            number/=10;
        }
        System.err.println(s);
    }
}
public class SumOfDigits {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        Scanner sc = new Scanner(System.in);
        obj.number = sc.nextInt();
        obj.sumofdigits();
        sc.close();
    }
}
