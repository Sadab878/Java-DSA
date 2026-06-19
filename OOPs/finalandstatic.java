package OOPs;
class Cricketer{
    static String country = "NZ";
    int runs;
    String name;
}
public class finalandstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.country = "India";
        System.out.println(c1.country);
    }
}
