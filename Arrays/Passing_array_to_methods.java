package Arrays;

public class Passing_array_to_methods {
    public static void main(String[] args) {
        int[] arr = {54,74,93,33};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] x) {
        x[2] = 44;
    }
}
