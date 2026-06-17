package loops;

import java.util.Scanner;

public class print_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        // for(int i = 1; i<=100; i++){
        //     if(i%2!=0) System.out.print(i+" ");

        // }
        // for(int i = 1; i<=100; i+=2){
        //     System.out.print(i+" ");

        // }


        // for(int i = n; i>=1; i--){
        //     System.out.print(i+" ");

        // }

        for(int i = 1; i<=n; i++){
            System.out.print(i*7+" ");

        }
        sc.close();
    }
}
