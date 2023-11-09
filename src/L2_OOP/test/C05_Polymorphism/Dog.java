package L2_OOP.test.C05_Polymorphism;

public class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void move(){
        System.out.println("Run");
    }
}
