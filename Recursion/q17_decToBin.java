package Recursion;
public class q17_decToBin {
    static int decToBin(int n){
        if (n==0) return 0;
        return 10*decToBin(n/2) + n%2;
    } 
    public static void main(String[] args) {
        System.out.println(decToBin(44));
    }
}
