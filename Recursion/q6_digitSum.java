// Problem:             digitSum(n)    = digitSum(1234) = 1+2+3+4 = 10
// SubProblem:          digitSum(n/10) = digitSum(123)  = 1+2+3   = 6  (Recursive work)
// SelfWork:(Addition)  lasDigit = n%10 = 4  : 6+4  = 10
// Recurrence Relation: result= digitSum(n/10) + n%10
//                      digiSum(1234) = digitSum(123) + 4 
// BaseCase:            for one digit number, digit itself is the digitSum.
package Recursion;
import java.util.*;
public class q6_digitSum {
    static int digitSum(int n){
        if (n<10) return n; 
        int result= digitSum(n/10) + (n%10);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println("Sum of digits is "+digitSum(n));
        sc.close();
    }
}
