package L1_StarterLevel.C5_Loops;

public class C06_doWhile_break {
    public static void main(String[] args){
        int i = 0;

        do{
            i++;
            System.out.println("Counter " + i);

            if (i==2) break;
            System.out.println("This line not executed.");
        }
        while(i < 5);

        System.out.println("Processed " + i + " iterations");
    }
}
