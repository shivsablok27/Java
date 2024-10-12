import java.util.*;
class LeapYear {
    public boolean isLeapYear(int year){
        if ((year%4==0 && year%100!=0)|| (year%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
}
public class p35_leapYear_check_Method{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Year: ");
        int y=sc.nextInt();
        LeapYear obj= new LeapYear();
        if (obj.isLeapYear(y)==true){
            System.out.println("It is leap Year");
        }
        else{
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
