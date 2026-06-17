package String;

public class Number_of_Vowels {
    public static void main(String[] args) {
        String str = "aiuhoewfhoasufdoabfhdsbmsvdjgsv";
        int count = 0;

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'e' || ch == 'u' || ch == 'a' || ch == 'i' || ch == 'o') {

                count++;
            }
        }
        System.out.println(count);
    }
}
