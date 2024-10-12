package OOPS;
class Rectangle{
    float length, width;
    void setlength(float l){
        length=l;
    }
    void setwidth(float w){
        width=w;
    }
    float perimeter(){
        return 2*(length+width);
    }
    float area(){
        return length*width;
    }
    void show(){
        System.err.println("Length = "+length);
        System.err.println("Width = "+width);
    }
    int sameArea(Rectangle r){
        if (area() == r.area()){
            return 1;
        }
        return 0;
    }
}
public class QuestionRect {
    static Rectangle r1 = new Rectangle();
    static Rectangle r2 = new Rectangle();

    static void areaComparing(){
        int check = r1.sameArea(r2);
        if(check==1){
            System.err.println("Area of both rectangles are equal");
        }
        else{
            System.err.println("Area of both rectangles are unequal");
        }
    }
    static void showPA(Rectangle r){
        System.err.println("Area = "+r.area());
        System.err.println("Perimeter = "+r.perimeter());
    }
    public static void main(String[] args) {
        r1.setlength(5);
        r1.setwidth(2.5f);
        r2.setlength(5);
        r2.setwidth(18.9f);

        System.err.println("Rectangle - I");
        r1.show();
        showPA(r1);

        System.err.println("\nRectangle - II");
        r2.show();
        showPA(r2);

        System.err.println("\nComparing Rectangle - I and Rectangle - II");
        areaComparing();
        r1.setlength(15);
        r1.setwidth(6.3f);

        System.err.println("\nAfter Editing in Rectangle - I: ");
        r1.show();
        showPA(r1);
        areaComparing();
    }
}
