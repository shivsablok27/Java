class calcu {
    int a,b;
    calcu(int num1, int num2){
        System.out.println("Constructor Called !");
        a=num1;
        b=num2;
    }
/*  'calcu' constructor can also be written as:
    
    calcu(int a, int b){
        System.out.println("Constructor Called !");
        this.a=a;
        this.b=b;
    }
*/
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
} 
public class p33_oop_implement_method_constructor_object_classes {
    public static void main(String[] args) {
        calcu obj1= new calcu(2,5);
        System.out.println(obj1.sum());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());

        calcu obj2= new calcu(9,4);
        System.out.println(obj2.sum());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
}
