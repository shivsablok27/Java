package Recursion;
public class q28_palindromeString {
    static boolean isPalindrome(String str, int l, int r){
        if (l>=r) return true;
        return (isPalindrome(str,l+1,r-1) && str.charAt(l)==str.charAt(r));
    }
    public static void main(String[] args) {
        String str= "LEVEL";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
