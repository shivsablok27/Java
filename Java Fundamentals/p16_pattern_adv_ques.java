public class p16_pattern_adv_ques {
    
    public static void main (String[] args){
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if (i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int s=1; s<=(5-i)*2; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                if (i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int s=1; s<=(5-i)*2; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


