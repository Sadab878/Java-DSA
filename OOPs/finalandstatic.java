package OOPs;
class Cricketer{
    static String country = "NZ";
    int runs;
    String name;
}
public class finalandstatic {
    public static void main(String[] args){
        Cricketer.country = "India";
        System.out.println(Cricketer.country);
    }
}
