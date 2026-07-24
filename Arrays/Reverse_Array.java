package Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {42,74,97,2,4,9,87,73,97};
        int n = arr.length;
        int i = 0,  j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        for(int ele : arr){
            
            System.out.print(ele + " ");
        } 

        // int[] arr = {1,2,3,4,5};

        // for(int i = arr.length-1; i >= 0; i--){
        // System.out.print(arr[i]+" ");

        // }

    }
}
