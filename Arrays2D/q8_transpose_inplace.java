package Arrays2D;
import java.util.*;
public class q8_transpose_inplace {
    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns: ");
        int r=sc.nextInt();     int c=sc.nextInt();
        int matrix[][]= Matrix.create(r,c);
        for (int i=0; i<r; i++){
            for (int j=i; j<c; j++){ 
/* if we start the loop by j=0, then double swapping leads to the orginal matrix again,
e.g. element 0,1 is swapped with 1,0 and when 1,0 comes, it is again swapped with 0,1.
hence we start the loop from j=i so that upper triangle is swapped with lower triangle.
Starting loop with j=i prevents double swapping as e.g. 0,1 of zeroth row is swapped 
with 1,0 of first row then starting of loop from j=i i.e. j=1 in first row will 
encounter element 1,1 and leaves swapping of 1,0.
Similarly 1,2 will be swapped with 2,1 and in next row loop starts from j=i i.e. j=2
it leaves element 2,1 (preventing double swapping with 1,2) and 2,2 and swap 2,3 
with 3,2 and hence the process continues.*/
                int temp= matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i]= temp;
            }
        }
        System.out.println("Transpose of entered matrix is: ");
        Matrix.print(matrix, r, c);
        // This inplace approach holds good for square matrix only.
    }
}

