package Recursion;
import java.util.*;
public class q30_arrayList_subsequencesString {
    static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans= new ArrayList<>();
        // base case
        if (str.length()==0){
            ans.add("");
            return ans;
        }
        // recursive work
        char current = str.charAt(0);
        ArrayList<String> small_ans= getSSQ(str.substring(1));

        //self work
        for(String s: small_ans){
            ans.add(current+s);
            ans.add(s);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans= getSSQ("abc");
        System.out.println(ans);
    }
}
