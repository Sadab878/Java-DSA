package String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s  = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Raghav");
        System.out.println(s);
        s.setCharAt(1, 'o');
        System.out.println(s);
    }
}
