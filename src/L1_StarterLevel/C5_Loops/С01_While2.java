package L1_StarterLevel.C5_Loops;

public class С01_While2 {
    public static void main(String[] args){
        int i = 5;
        int i2 = 0;

        while (i > 0){
            i--;
            System.out.println("Counter" + i);
            i2++;
        }
        System.out.println("Processed " + i2 + " iterations");
    }
}
