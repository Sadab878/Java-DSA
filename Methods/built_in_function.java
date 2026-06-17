package Methods;

import java.util.Scanner;

public class built_in_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // System.out.println(Math.min(2,3));
        // System.out.println(Math.max(2,3));
        // System.out.println(Math.pow(2,3));
        // System.out.println(Math.floor(2.2));
        // System.out.println(Math.ceil(2.6));
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(a, b),(Math.max(c,d))));
        
        sc.close();
    }
}
