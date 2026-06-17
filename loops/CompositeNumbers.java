package loops;

import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter nuber: ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                flag = false;
                System.out.println(i);
                System.out.println(n/i);
                break; 
            }
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==false) System.out.println("Composite number");
        else System.out.println("Prime number");
        sc.close();
    }
}
