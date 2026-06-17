package if_else;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int magnitude = Math.abs(num);

        if (magnitude < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is NOT smaller than 69");
        }

        sc.close();
    }
}
