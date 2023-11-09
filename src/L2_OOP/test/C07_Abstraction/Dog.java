package L2_OOP.test.C07_Abstraction;

public class Dog extends classAbstractAnimal{
    @Override
    public void animalSound() {
        super.notAbsMeth();
        System.out.println("Woof woof");
    }
}
