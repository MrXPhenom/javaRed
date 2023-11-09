package L2_OOP.test.C11_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addLast("Mercedes");
        cars.addFirst("Lamborghini");
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println(cars);
    }
}
