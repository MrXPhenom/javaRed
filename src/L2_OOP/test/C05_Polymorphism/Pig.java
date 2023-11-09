package L2_OOP.test.C05_Polymorphism;

public class Pig extends Animal {

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void move(){
        super.move();
        System.out.println("Run");
    }
}