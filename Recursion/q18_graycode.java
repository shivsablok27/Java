package Recursion;
public class q18_graycode {
    static int graycode(int n,int i){
        if (n==0) return 0;
        int a = n%10; //last digit
        n=n/10;
        int b=n%10;   //second last digit
        int result=0;
        if ((a==0 && b==1)||(a==1 && b==0)){ //both bits are different, XOR=1 
            result+= Math.pow(10,i);
        }
        return graycode(n,i+1) + result;
    }
    public static void main(String[] args) {
        System.out.println(graycode(100110, 0));
    }
}
