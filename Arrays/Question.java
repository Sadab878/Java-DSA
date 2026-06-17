package Arrays;

public class Question {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6,};

        change(arr);
        

    }
    public static void change(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(i % 2==0){
                arr[i] += 10;
            }
            else{
                arr[i] *=2;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
