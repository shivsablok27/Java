package Arrays2D;
import java.util.*;
public class q3_MatrixMultiplication {
    static Scanner sc= new Scanner (System.in);
    static void Matrix_Multiply(int[][]A, int r1, int c1, int[][]B, int r2, int c2){
        int Mul[][]= new int [r1][c2];
        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<c1; k++){  // k<r2 also work as r2=c1
                    Mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrices is: ");
        printMatrix(Mul,r1,c2);
    }
    static void printMatrix (int[][] Matrix, int row, int column){
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
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
        System.out.print("Enter number of rows of matrix A: ");
        int r1=sc.nextInt();
        System.out.print("Enter number of columns of matrix A: "); 
        int c1= sc.nextInt();
        System.out.print("Enter number of rows of matrix B: ");    
        int r2= sc.nextInt();
        System.out.print("Enter number of columns of matrix B: "); 
        int c2= sc.nextInt();

        if (c1!=r2){
            System.out.println("Invalid Matrix Order(s): Multiplication not possible");
            return;
        }
        
        System.out.println("Enter values for Matrix A: ("+ r1+"X"+c1+")");
        int A[][]= Create_Matrix(r1, c1);
        System.out.println("Enter values for Matrix B: ("+ r2+"X"+c2+")");
        int B[][]= Create_Matrix(r2, c2);
        Matrix_Multiply(A,r1,c1,B,r2,c2);
    }
}
