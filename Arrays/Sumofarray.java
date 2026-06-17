package Arrays;

import java.util.Scanner;

public class Sumofarray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
                sum += arr[i];
        }
        System.out.print("Sum of array is: " + sum);

        sc.close();

    }
}
