package loops;

import java.util.Scanner; 

public class ASCII_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 65; i <= n; i++){
            System.out.println((char)i+" "+ i);
        }
        sc.close();

    }
}
