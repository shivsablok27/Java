import java.util.*;
class Area{
    int length;
    int breadth;
// Constructor declaration, special type of method that is used to initialize the 
//instance variables and has the same name as the class
    Area(int l, int b){   
        length = l;
        breadth = b;
    }
// Declaration of method for calculation the area
    public int getArea(){
        return length*breadth;
    }
}
public class p28_class_object_constructor_method_based_basic_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
        Area a = new Area(l,b); // value of l and b goes to constructor for 
                                // initialization of instance variable of class: Area
        System.out.println("Area : "+a.getArea());
    sc.close();
    }
}
