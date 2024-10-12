package Recursion;
import java.util.*;
public class q26_removeCharFromString {
    static String removeA(String str){
        if (str.length()==0) return "";
        String updated_str= removeA(str.substring(1));
        char current_char= str.charAt(0);
        if (current_char!='A') return current_char + updated_str;
        return updated_str;
    }
    static String removeChar(String str,char x, int idx){
        int n= str.length();
        if (idx==n) return "";
        String updated_str= removeChar(str, x, idx+1);
        char current_char = str.charAt(idx);
        if (current_char!=x) return current_char + updated_str;
        return updated_str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str= sc.nextLine();
        //System.out.print("Enter character to be removed: ");
        //char x= sc.next().charAt(0);
        //System.out.println("Updated String: "+removeChar(str,x,0));
        System.out.println("Updated String: "+removeA(str));
        sc.close();
    }
}
