package Arrays;

import java.util.Scanner;

public class Output_Inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        // int[] arr = new int[5];
        // arr[0] = 34;
        // arr[1] = 14;
        // arr[2] = 7;
        // arr[3] = 65;
        // arr[4] = 2;
        // for(int i = 0; i < arr.length; i++){
        // System.out.print(arr[i] +" ");
        // }

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }

        for (int i = 0; i < arr.length; i++) {
           
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
