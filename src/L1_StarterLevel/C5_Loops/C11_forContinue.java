package L1_StarterLevel.C5_Loops;

public class C11_forContinue {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println("Counter = " + i);

            if (false) continue;
            System.out.println("This line not executed.");
        }
    }
}
