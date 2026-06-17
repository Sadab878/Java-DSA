package if_else;

import java.util.Scanner;

public class Multiple_conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // if(n>999 && n<10000) System.out.println("4 digit number");
        // else System.out.println("Not a 4 digit number");
        // sc.close();
        if(n%5 == 0 || n%3 == 0)
            System.out.println("Divisible by 5 or 3");
        else
            System.out.println("Not divisible");
        sc.close();
    }
}
