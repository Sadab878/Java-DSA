import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        System.out.println(a+b+c);
        sc.close();
    }
}
