package OOPs;
class Students{
    String name;
    private int rno;
    double cgpa;
    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 8.9;
        s1.name = "sadab";
        s1.setRno(15);
        System.out.println(s1.getRno());
    }
}
