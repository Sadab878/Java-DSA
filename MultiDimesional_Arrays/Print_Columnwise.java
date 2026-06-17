package MultiDimesional_Arrays;

public class Print_Columnwise {
    public static void main(String[] args) {
        int[][] arr = { { 5, 4, 3, 9 }, { 3, 5, 2, 1 }, { 6, 9, 7, 6 } };

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
