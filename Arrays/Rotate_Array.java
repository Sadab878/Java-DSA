package Arrays;

import java.util.Arrays;

public class Rotate_Array {
    public static void rotate(int arr[], int k) {
        int n = arr.length;

        // Handle cases where k > n
        k = k % n;

        // Temporary array
        int temp[] = new int[n];

        // Rotate elements
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        // Copy temp back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;

        rotate(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
