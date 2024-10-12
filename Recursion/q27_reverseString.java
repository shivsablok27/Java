package Recursion;
public class q27_reverseString {
    static String reverseString(String str){
        if (str.length()==0) return "";
        String rev= reverseString(str.substring(1));
        return rev + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("reward"));
    }
}
