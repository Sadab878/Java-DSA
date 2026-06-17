package MultiDimesional_Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{2,5,1,7,},{4,7,9,4},{3,6,2,7},{3,7,0,8}};
        print(arr);
        System.out.println();
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int[][] arr) {
        for(int[] a: arr){
            for(int ele: a){

                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
