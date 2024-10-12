package Arrays2D;
import java.util.*;
public class q1_timetableAccess {
    public static void main(String[] args) {
        String timetable[][]= 
        {
           {"Physics", "PPS", "BEE", "Maths", "PPS-L", "PPS-L", "EE-L",  "EE-L"},
           {"EE", "Physics", "Maths", "PDP", "SS", "Physics-T(RK)", "Maths-T", "Graphics"},
           {"PPS", "EE", "Physics", "SS", "Maths-T", "Physics-T(V)", "Sports", "Sports"},
           {"Maths", "SS", "EE", "PPS", "Physics", "Graphics-L", "Graphics-L", "Graphics-L"},
           {"Maths", "PPS", "SS", "Physics", "PPS-L", "PPS-L", "Physics-L", "Physics-L"}
        } ;
        String d[]= {"monday","tuesday","wednesday","thursday","friday"};

        Scanner sc= new Scanner (System.in);
        System.out.println("Access the Time-Table of B2.2");
        System.out.print("Enter Day: ");
        String day= sc.next().toLowerCase();
        int dayindex=-1;
        for (int i=0; i<d.length; i++){
            if (d[i].equals(day)){
                dayindex=i;
                break;
            }
        }
        if (dayindex!=-1){
            System.out.print("Enter period Number: ");
            int period= sc.nextInt();
            if (period>=1 && period<= timetable[dayindex].length){
                System.out.println("Subject= "+ timetable[dayindex][period-1]);
            }
            else{
                System.out.println("Invalid period number");
            }
        }
        else{
            System.out.println("Invalid day");
        } 
        sc.close();
    }
}
