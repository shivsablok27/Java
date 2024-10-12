package Arrays2D;
import java.util.*;
public class q9_rotateMatrix {
    static Scanner sc = new Scanner(System.in);
    static void reverseEachRow(int arr[]){
        int a=0, b=arr.length-1;
        while (a<b){
            int temp= arr[a];
            arr[a]= arr[b];
            arr[b]=temp;
            a++; b--;
        }
    }
    static void transpose(int matrix[][], int order){
        for (int i=0; i<order; i++){
            for (int j=i; j<order; j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter order (Square Matrix): "); 
        int order= sc.nextInt();
        int matrix[][]= Matrix.create(order, order);
        transpose(matrix, order);
        for (int i=0; i<order; i++){
            reverseEachRow(matrix[i]);
        }
        System.out.println("After clockwise rotation by 90 degree, matrix: ");
        Matrix.print(matrix, order, order);
    }
}
