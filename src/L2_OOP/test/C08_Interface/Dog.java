package L2_OOP.test.C08_Interface;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void run() {
        System.out.println("Move");
    }
}
