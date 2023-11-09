package L1_StarterLevel.C7_Methods.Chapter1;

public class C08_MethodRecursion {

    static void recursion(int counter) {
//        int i = 0;
        counter--;

        System.out.println("First half of the method: " + counter);

        if(counter != 0)
            recursion(counter);
        System.out.println("Second half of the method: " + counter);
    }

    public static void main(String[] args){
        recursion(3);
    }
}
