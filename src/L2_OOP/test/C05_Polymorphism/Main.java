package L2_OOP.test.C05_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        Animal mySwallow = new Swallow();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        mySwallow.animalSound();
        myPig.move();
        myDog.move();
        mySwallow.move();
    }
}
