public class p8_incredecre {
    public static void main (String [] args){
        int i = 5; int j=10;
        System.out.println("Original i=5 and j=10");
        System.out.println("i++ will be "+ i++); // Used (printed initial value i.e. 5) --> Increased (5 to 6)
        System.out.println("now i= "+ i);   // printed increased value (i.e. 6)

        System.out.println("++j will be "+ ++j);  // Increased (10 to 11) --> Used (printed increased value i.e. 11)
        System.out.println("now j= "+ j);    // printed increased value i.e. 11

        int k = 5; int l=10;
        System.out.println("Original k=5 and l=10");
        System.out.println("k-- will be " + k--); // Used (printed initial value i.e. 5) --> Decreased (5 to 4)
        System.out.println("now k= "+ k);   // printed decreased value (i.e. 4)

        System.out.println("--l will be "+ --l);  // Decreased (10 to 9) --> Used (printed decreased value i.e. 9)
        System.out.println("now l= "+ l);    // printed increased value i.e. 9
    }
}
    

