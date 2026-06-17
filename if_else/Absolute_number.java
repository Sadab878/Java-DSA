package if_else;

import java.util.Scanner;

public class Absolute_number {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // if(n>=0){
        //     System.out.println(n);
        // }
        // else System.out.println(-n);
        // sc.close();
        if(n<0) {
            n = -n;
        System.out.println(n);
        }
        sc.close();
    }
}
