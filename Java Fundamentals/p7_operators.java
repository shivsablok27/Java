public class p7_operators {
    public static void main(String [] args){
        System.out.println(9/2);    // gives integer part answer 
        System.out.println(9.0/2);  // answer in proper float
        System.out.println(3==5);   // Check true or flase
        System.out.println(3<5);    // Check true or flase
        System.out.println(3<5 && 2>8); //in AND, both statement should be true to print true
        System.out.println(8>7 && 6>5); 
        System.out.println(8<7 || 8<9); //in OR, both statement should be flase to print false
        System.out.println(4==5 || 78<87 );
        System.out.println(!(4==5));   // complement the answer
        System.out.println(!(5>1));
        System.out.println("Shiv" instanceof String); //check object possession to class
    }
    
}
