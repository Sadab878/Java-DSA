package Arrays;

public class Two_sum_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int target = 2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target) 
                    System.out.print("Target found in sum of Array Index "+i+" and "+j);
            
        }
    }
}
