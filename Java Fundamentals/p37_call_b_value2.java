public class p37_call_b_value2 {
    static int j;
    public static int fun(int i){
        j=7;
        i=i+2;
        j=j+6;
        System.out.println(i+" "+j);
        return i;
    }
        public static void main (String args[]){
        int x=9, y=5;
        System.out.println(x+" "+y);                                                                                                           
        x=fun(x) ;                                         
        System.out.println(x+" "+y);                           
        y=fun(x) ;                                       
        System.out.println(x+" "+y);
    }
}
