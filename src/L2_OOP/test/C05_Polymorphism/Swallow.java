package L2_OOP.test.C05_Polymorphism;

public class Swallow extends Animal{
    public void animalSound(){
        System.out.println("Chirping");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Fly");
    }
}
