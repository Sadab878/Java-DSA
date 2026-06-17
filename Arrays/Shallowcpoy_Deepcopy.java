package Arrays;
import java.util.Arrays;
public class Shallowcpoy_Deepcopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,};
        // int[] x = arr;
        // x[0] = 100; shallowcopy

        int[] y = Arrays.copyOf(arr,arr.length); //Deepcopy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
