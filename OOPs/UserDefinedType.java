package OOPs;

import java.util.Scanner;

class Students{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }
public class UserDefinedType {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Students s1 = new Students();
        s1.name = "Rashid";
        s1.rno = 15;
        s1.cgpa = 7.98;

        Students s2 = new Students();
        s2.name = "Areeb";
        s2.rno = 45;
        s2.cgpa = 6.98;

         Students s3 = new Students();
        s3.name = "Shahab";
        s3.rno = 75;
        s3.cgpa = 7.8;

        System.out.println(s1.name +" "+ s1.rno +" "+ s1.cgpa);
        s1.print();
        s2.print();
        s2.print();
        sc.close();
    }
    // public static void print(Students s) {
    //     System.out.println(s.name +" "+s.rno+" "+s.cgpa);
    // }
}
