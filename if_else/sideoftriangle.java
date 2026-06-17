package if_else;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side of triangle: ");
        int a = sc.nextInt();

        System.out.println("Enter second side of triangle: ");
        int b = sc.nextInt();

        System.out.println("Enter third side of triangle: ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("This is triangle");
        }
        else System.out.println("This is not triangle");
        sc.close();
    }
}
