package MultiDimesional_Arrays;

public class Maximumelementin2dArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,7,5},{6,9,8}};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++)
                if(arr[i][j]>max) max = arr[i][j];
        }
        System.out.print(max);

        System.out.println();

        //min value

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++)
                if(arr[i][j]<min) min = arr[i][j];
        }
        System.out.print(min);
    }
}
