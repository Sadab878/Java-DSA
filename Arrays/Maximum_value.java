package Arrays;

public class Maximum_value {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,878,-54,-45};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
