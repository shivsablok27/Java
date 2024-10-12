import java.util.*;
public class p27_prime_pyramid {
//Separate UDF for checking primality of the 'counter' i.e. 'num' in the function
public static boolean PrimeCheck(int num) { 
    int f=0;
    for (int i = 2; i < num; i++) {
       if (num % i == 0)
          f=1;
    }
    if (f==0)
       return true;
    else
       return false;
 }
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("\nEnter no. of rows : ");
     int rows = sc.nextInt();
 //Prime numbers start from 2, so declaring a variable 'counter' initialized as 2
     int counter = 2; 
 //Defining outer loop for number of rows   
     for (int i = 1; i <= rows; i++) { 
 //Defining a nested loop for number of spaces
         for (int s=1; s<=rows-i; s++){
             System.out.print("  ");
         }
 /* Definiting nested loop for numbers to be printed, j depicting number of elements
 in each row that is equal to the row number.*/
         for (int j = 1; j <= i; j++) {
 /* Declaring a loop inside loop of j which will keep on increasing counter, 
 until it gets a prime counter.. primality being checks by means of UDF declared
 Case1: when there is prime counter, UDF returns true, while will have false, 
 loop terminates, and that prime number will be printed and counter will increase.
 Case2: when there is not prime counter.. UDF returns false, while will have true,
 counter increases and checks for primality again by means of 'while' and 'UDF', it
 keeps on continuing till counter is increased to a prime number, which will give 
 false to while and followe by printing prime counter..
 As per the loop j, each row will have number of elements equal to the row number */
             while(!PrimeCheck(counter)){
                 counter++;
             }
             System.out.print(counter+"  ");
             counter++;
         }
 //Empty printing statement for each next line after execution of loop j each time.
         System.out.println();
         System.out.println();
     }
     sc.close();
 }
}
