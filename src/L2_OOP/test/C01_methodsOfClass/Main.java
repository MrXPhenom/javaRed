package L2_OOP.test.C01_methodsOfClass;

import static L2_OOP.test.C01_methodsOfClass.Car.msgPrice;
public class Main {
    public static void main(String[] args) {
        msgPrice();
        Car car = new Car();
        car.msgSpeed();
    }
}
