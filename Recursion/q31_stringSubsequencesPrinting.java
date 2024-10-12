package Recursion;
public class q31_stringSubsequencesPrinting {
    static void printSSQ(String s, String currentSSQ){      // s= "abc", currentSSQ = ""
        if(s.length()==0){
            System.out.print(currentSSQ + " ");
            return;
        }
        char currentCharacter  = s.charAt(0);         // a 
        String remainingString = s.substring(1); // bc
        //if currentCharacter chooses to include: 
            printSSQ(remainingString, currentSSQ + currentCharacter);
        //if currentCharacter chooses not to include:
            printSSQ(remainingString, currentSSQ); 
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
