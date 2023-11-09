package L1_StarterLevel.C5_Loops;

public class C05_do_while {
    public static void main(String[] args){

        int i = 0;

        do {
            i++;
            System.out.println("Counter" + i);
        } while(i < 3);
        System.out.println("Processed " + i + " iterations.");
    }
}
