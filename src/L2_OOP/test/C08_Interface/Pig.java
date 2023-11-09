package L2_OOP.test.C08_Interface;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Wee wee");
    }

    @Override
    public void run() {
        System.out.println("Move on Earth");
    }
}
