package Arrays2D;
import java.util.*;
public class Matrix {
    static Scanner sc= new Scanner (System.in);
    static int[][] create(int row, int column){
        System.out.println("Enter matrix values: ");
        int Matrix[][]= new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        return (Matrix);
    }
    public static void print(int[][] Matrix, int row, int column){
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] Create(int r) {
        return null;
    }
    
}
