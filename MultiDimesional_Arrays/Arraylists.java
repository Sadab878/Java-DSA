package MultiDimesional_Arrays;

import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(54); a.add(7); a.add(9);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(87); b.add(54); b.add(71); b.add(9);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(3); c.add(4); c.add(70); 
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        for(ArrayList<Integer> list: arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
