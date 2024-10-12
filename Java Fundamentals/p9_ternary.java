import java.util.*;
public class p9_ternary {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your marks out of 100: ");
            int marks=sc.nextInt();
            String result=marks>45?"You are pass":"You are fail";
            System.out.println(result);
        }

    }
    
}

