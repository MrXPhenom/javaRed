package L2_OOP.test.C01_methodsOfClass;

public class Car {
    public void msgSpeed(){
        System.out.println("Max Speed");
    }

    static void msgPrice(){
        System.out.println("Max Price");
    }

    public static void main(String[] args) {
        msgPrice();             //static method
        Car car = new Car();
        car.msgSpeed();         //public method
    }
}
