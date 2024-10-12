import java.util.Scanner;

public class p18_function_power{
    public static int power(int x, int y){
        int mul=x;
        for (int i=1; i<y; i++){
            mul=mul*x;
        }
        return mul;
    }
    public static void main(String args[]){
        // Different ways for calling the function
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : "); int b= sc.nextInt();
        System.out.print("Enter power: "); int p= sc.nextInt();
        int result =  power(b,p);
        System.out.println("Result= "+ result);

        int n1=5, n2=3;
        int result2= power (n1,n2);
        System.out.println("Result2= "+ result2);

        int result3 = power(11,4);
        System.out.println("Result3= "+ result3);

        System.out.println("Result4= "+ power(2,5));  
        
        System.out.println("Result5= "+ Math.pow(2.5,1.5)); //built_in_function
    sc.close();
    }
}
