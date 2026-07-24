package Arrays;

import java.util.Arrays;

public class sortedarray {
     public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0};
        Arrays.sort(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
