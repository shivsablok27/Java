// Q20. WAP to display frequency of each distinct element in the array
package Arrays;
public class q20_Freq_of_each_element {
    static int[] frequencyArray(int arr[],int n){
        int freq[]=new int[1000];
        for (int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,1,2,2,5,4,5,5,4,5,5}; int n=arr.length;
        int freq[]=frequencyArray(arr,n);
        for (int i=0; i<n; i++){
            boolean isDistinct=true;
            for (int j=i+1; j<n; j++){
                if (arr[i]==arr[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct){
                System.out.println("Frequency of "+arr[i]+" is "+freq[arr[i]]);
            }
        }
    }
}
