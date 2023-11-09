package L2_OOP.test.C10_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<>();

        car.add("BMW");
        car.add("Volvo");
        car.add("Nissan");
        car.add("Lamborghini");
        car.add("Ford");
        Collections.sort(car);
        System.out.println(car);

        System.out.println(car.get(2));
        car.set(0, "Königesesseg");
        System.out.println(car.get(0));
        car.remove(4);
        System.out.println(car);
        System.out.println(car.size());

        ArrayList<Integer> ari = new ArrayList<>();
        ari.add(5);
        ari.add(3);
        ari.add(7);
        ari.add(6);
        ari.add(2);
        ari.add(1, 20);
        System.out.println(ari);

        int a = ari.get(2) + ari.get(4);
        System.out.println(a);

        Collections.sort(ari);
        System.out.println(ari);

//        System.out.println(car);
//        for (int i = 0; i < car.size(); i++) {
//            System.out.println(car.get(i));
//        }
//        for (String i:car) {
//            System.out.println(i);
//        }
    }
}
