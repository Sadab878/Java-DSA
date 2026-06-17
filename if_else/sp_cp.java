package if_else;

import java.util.Scanner;

public class sp_cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit" +" "+ (sp-cp));
        }
        else if (sp == cp) System.out.println("No profit");

        else{
            System.out.println("loss" +" "+ (cp-sp));
        }
        sc.close();
    }
}
