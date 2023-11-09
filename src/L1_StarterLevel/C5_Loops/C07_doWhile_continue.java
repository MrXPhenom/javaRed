package L1_StarterLevel.C5_Loops;

public class C07_doWhile_continue {
    public static void main(String[] args){
        int counter = 0;

        do{
            counter++;
            System.out.println("Counter "+ counter);

            if (counter==3) continue;

            System.out.println("This line not executed.");
        }
        while (counter < 5);
        System.out.println("Processed " + counter + " iterations");
    }
}
