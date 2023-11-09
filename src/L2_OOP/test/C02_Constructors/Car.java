package L2_OOP.test.C02_Constructors;

public class Car {
    String mark;
    int price;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String mark, int price) {
        this.mark = mark;
        this.price = price;
    }

    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.mark = "BMW M5";
        BMW.price = 30000;
        System.out.println(BMW.mark + "\n" + BMW.price + "$");
        Car Tavria = new Car("Tavria Nova");
        Tavria.price = 45000;
        System.out.println(Tavria.mark + "\n" + Tavria.price + "$");
        Car Mers = new Car("Mers Gelik", 10000);
        System.out.println(Mers.mark + "\n" + Mers.price + "$");
    }
}
