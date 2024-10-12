package Arrays;
public class p2_ArrayReference {
    static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+"  ");
        } 
        System.out.println();   
    } 
    public static void main(String[] args) {
        int arr1[] = {4,8,12,16,20};
        int arr2[] = arr1; // Copying of arr1 into arr2
        System.out.print(  "Parent array i.e. arr1 is: ");
        printArray(arr1);
        System.out.print("Copied array i.e. arr2 is: ");
        printArray(arr2);
        //changing values of arr2 to see impact on arr1
        arr2[0]=0;
        arr2[1]=0;
        System.out.print("After changing arr1 is: ");
        printArray(arr1);
        System.out.print("After changing arr2 is: ");
        printArray(arr2);
    }
}
