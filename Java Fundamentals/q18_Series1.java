// 1 – 2 + 3 – 4 + 5 – 6 + 7 – 8 + 9 – 10
import java.util.Scanner;
public class q18_Series1 {
    public static void main (String[] args){
        int sign=1, result=0;
        for (int i=1; i<=10; i++){
            result = result + i*sign;
            sign=sign*-1;
        }
        System.out.println("Result= "+ result);
    }
}
