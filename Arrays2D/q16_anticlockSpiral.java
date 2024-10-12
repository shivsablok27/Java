package Arrays2D;
import java.util.*;
public class q16_anticlockSpiral {
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
            topRow      -->  rightCol  to  leftCol
            leftCol     -->  topRow    to  bottomRow
            bottomRow   -->  leftCol   to  rightCol
            rightCol    -->  bottomRow to  topRow
        */
            for (int x=rightCol; x>=leftCol && totalElements < r*c; x--){
                System.out.print(matrix[topRow][x]+" ");
                totalElements++;
            }
            topRow++;
            for (int x=topRow; x<=bottomRow && totalElements < r*c; x++){
                System.out.print(matrix[x][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
            for (int x=leftCol; x<=rightCol && totalElements < r*c; x++){
                System.out.print(matrix[bottomRow][x]+" ");
                totalElements++;
            }
            bottomRow--;
            for (int x=bottomRow; x>=topRow && totalElements < r*c; x--){
                System.out.print(matrix[x][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
        }
    }
}
