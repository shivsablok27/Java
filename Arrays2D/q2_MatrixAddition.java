package Arrays2D;
import java.util.*;
public class q2_MatrixAddition {
    static Scanner sc= new Scanner (System.in);
    static void printMatrix (int[][] Matrix, int row, int column){
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Add_Matrix(int A[][], int B[][], int row, int column){
        int sum[][]= new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        printMatrix(sum, row, column);
    }
    static void Subtract_Matrix(int A[][], int B[][], int row, int column){
        int sum[][]= new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                sum[i][j] = A[i][j] - B[i][j];
            }
        }
        printMatrix(sum, row, column);
    }
    static int[][] Create_Matrix(int row, int column){
        int Matrix[][]= new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        return (Matrix);
    }
    public static void main(String[] args) {
        System.out.print("Enter no. of rows: ");    
        int row= sc.nextInt();
        System.out.print("Enter no. of columns: "); 
        int column= sc.nextInt();
        System.out.println("Enter values of 1st Matrix");
        int A[][]= Create_Matrix(row, column);
        System.out.println("Enter values of 2nd Matrix");
        int B[][]= Create_Matrix(row, column);
        System.out.println("Addition of Matrix: ");
        Add_Matrix(A,B,row,column);
        System.out.println("Subtraction of Matrix: ");
        Subtract_Matrix(A, B, row, column);
    }
}
