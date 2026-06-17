package Arrays;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(2);
        arr.add(5);
        arr.add(8);
        arr.add(10);
        arr.add(35);

        arr.set(2, 10);

        System.out.println(arr);

        // int n = arr.size();
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        // System.out.println();

        // for(int ele : arr){
        //     System.out.print(ele+" ");
        // }
        System.out.println();

        //reverse arraylist

        int i = 0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
