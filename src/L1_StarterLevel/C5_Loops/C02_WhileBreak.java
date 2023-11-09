package L1_StarterLevel.C5_Loops;

public class C02_WhileBreak {
    public static void main(String[] args){
        int i = 0;

        while(i < 5){
            i++;
            System.out.println("Counter " + i);

//            if (true) break;
            if (i == 3) break;

            System.out.println("This line not executed.");
        }
//        System.out.println("Processed " + i + " iterations");
    }
}
