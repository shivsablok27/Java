package OOPS;
import java.util.*;

class Aeroplane{
    Scanner sc = new Scanner (System.in);
    int flight_no;
    String destination;
    float distance;
    float fuel;
    void feedInfo(){
        System.out.print("Enter Flight number: ");
        flight_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Destination: ");
        destination = sc.nextLine();
        System.out.print("Enter Distance: ");
        distance = sc.nextFloat();
        calFuel(distance);
    }
    void calFuel(float distance){
        if(distance<=1000){
            fuel = 500;
        }
        else if(distance> 1000 && distance<=2000){
            fuel = 1100;
        }
        else if(distance>2000){
            fuel = 2200;
        }
    }
    void showInfo(){
        System.out.println("Information of Flight: ");
        System.out.println("Flight Number:" + flight_no);
        System.out.println("Destination: "+ destination);
        System.out.println("Distance: "+ distance);
        System.out.println("Fuel: "+fuel);
    }

}
public class classDefinitionQuestion {
    public static void main(String[] args) {
        Aeroplane obj = new Aeroplane();
        obj.feedInfo();
        System.out.println();
        obj.showInfo();
    }
}
