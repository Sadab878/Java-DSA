package loops;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n<0) n = -n;
        int rev = 0;
        while(n!=0){
            rev *= 10;
            rev += (n%10);
            n/=10;
        }
        System.out.print(rev);
        sc.close();
    }
}
