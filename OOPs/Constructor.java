package OOPs;

public class Constructor {
    
    public static class Car{
        int price;
        String name;

        Car(){

        }
        Car(int x, String s){
            price = x;
            name = s;
        }

        Car(String s, int x){
            name = s;
            price = x;
        }

        void print(){
            System.out.println(price+ " "+ name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(1225000, "Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto", 120000);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";
    }
}
