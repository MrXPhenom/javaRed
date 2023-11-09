package L1_StarterLevel.C5_Loops;

public class C10_forBreak {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("Counter = " + i);

            if (i == 3) break;
            System.out.println("This line not executed.");
        }
    }
}
