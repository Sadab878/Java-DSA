package MultiDimesional_Arrays;

import java.util.Scanner;

public class Outputin2darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr[0].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
