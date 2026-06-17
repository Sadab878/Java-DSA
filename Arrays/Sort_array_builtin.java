package Arrays;

import java.util.Arrays;

public class Sort_array_builtin {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 5, 2, 8, 2, -3, -1, 10 };
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
