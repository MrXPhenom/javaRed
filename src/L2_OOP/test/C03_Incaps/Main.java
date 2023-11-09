package L2_OOP.test.C03_Incaps;

public class Main {
    public static void main(String[] args) {
        People people = new People("Pavlo", 28);
        People people1 = new People();
        people1.setName("Mykhailo");
        people1.setAge(23);
        System.out.println(people.getName() + "\n" + people.getAge() + " years old" + "\n" + people1.getName() + "\n" + people1.getAge() + " years old");

        Car car = new Car("Lamborghini", 50000, "Red", 250);
        Car car1 = new Car();
        car1.setMark("Ferrari");
        car1.setPrice(70000);
        car1.setColor("Black");
        car1.setSpeed(270);

        System.out.println(car.getMark() + " " + car.getSpeed() + " " + car.getColor() + " " + car.getPrice() + "$" +  "\n"
                + car1.getMark() + " " + car1.getSpeed() + " " + car1.getColor() + " " + car1.getPrice() + "$");
    }
}
