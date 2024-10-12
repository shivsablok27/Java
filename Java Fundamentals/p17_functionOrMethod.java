class tab{
    public static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n + " x "+i+" = "+ n*i);
        }
    }
}
public class p17_functionOrMethod {
    public static void main (String[] args){
        tab.table(5);
        tab.table(6);
        tab.table(7);
    }
}
