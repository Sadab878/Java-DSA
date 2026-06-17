package Arrays;

public class Search_in_arrays {
    public static void main(String[] args) {
        int[] arr = { 64, 93, 9, 3, 75, 98 };
        int target = 7;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                System.out.println("Target exist in Array " + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Target missing in Array");
    }
}
