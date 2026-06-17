package Arrays;

public class Second_maximum_element {
     public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,8,-4,-5,10};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("Maximum Element "+max);

        int Smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Smax && arr[i]!=max) Smax = arr[i];
        }
        System.out.println("Second Maximum Element "+Smax);
    }
}
