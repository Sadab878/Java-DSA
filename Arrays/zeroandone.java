package Arrays;

public class zeroandone {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 0, 1, 1, 0 };
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
