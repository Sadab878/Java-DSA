package if_else;

import java.util.Scanner;

public class ternary_in_variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int x = (n>=0) ? 100 : 0;
        System.out.println(x);
        sc.close();
    }
}
