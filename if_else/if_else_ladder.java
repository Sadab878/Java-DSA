package if_else;

import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Riya");
        }

        else if (n % 3 == 0) {
            System.out.println("Banu");
        }

        else if (n % 5 == 0) {
            System.out.println("Arnav");

        } else {

            System.out.println("Not divisible by 5 and 3");
        }
        sc.close();
    }
}
