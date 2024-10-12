import java.util.Scanner;
public class p34_string_method_middle_character{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scn.nextLine();
        System.out.println(s.length());
        System.out.println(middle(s));
        scn.close();
    }
    public static String middle(String s){
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2 - 1, s.length()/2 + 1);
        }
        else{
            return s.substring((s.length() - 1)/2, s.length()/2 + 1);
        }
}}

