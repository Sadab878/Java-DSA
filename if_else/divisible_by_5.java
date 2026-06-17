package if_else;

import java.util.Scanner;

public class divisible_by_5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
        sc.close();

    }
}
    

