public class p15_Break_Continue_Concept {
    public static void main (String[] args){
        for (int i=0; i<=10; i++){
            if (i==5){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int j=0; j<=10; j++){
            if (j==5){
                continue;
            }
            System.out.print(j+" ");
        }
    }
}
