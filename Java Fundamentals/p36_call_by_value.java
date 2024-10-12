public class p36_call_by_value {
    static int j=7; // default argument
    public static int fun(int i,int j){
        i=i+2;
        j=j+6;
        System.out.println(i+" "+j);
        return i;
    }
    public static int fun(int i){
        i=i+2;
        j=j+6;
        System.out.println(i+" "+j);
        return i;
    }
    public static void main (String [] args){
        int x=3;
        int y=4;
        System.out.println(x+" "+y);
        y=fun(x); 
// go to 2nd fun function as it requires only one
// argument as another is available by default if not provided
        System.out.println(x+" "+y);
        x=fun(x,y);
        System.out.println(x+" "+y);
    }
}
