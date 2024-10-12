package Arrays2D;
import java.util.*;
public class q11_spiral_elementPrinting {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter rows and columns: ");
        int r= sc.nextInt(), c=sc.nextInt();
        int matrix[][]= Matrix.create(r, c);
        System.out.println("Spiral order of elements: ");
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements=0;
        while (totalElements < r*c){
        /*
           What to print     Loop traversal
            topRow      --> leftCol   to  rightCol
            rightCol    --> topRow    to  bottomRow
            bottomRow   --> rightCol  to  leftCol
            leftCol     --> bottomRow to  topRow
        */
            for (int j=leftCol; j<=rightCol && totalElements < r*c; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            for (int i=topRow; i<=bottomRow && totalElements < r*c; i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            for (int j=rightCol; j>=leftCol && totalElements < r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            for (int i=bottomRow; i>=topRow && totalElements < r*c; i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
