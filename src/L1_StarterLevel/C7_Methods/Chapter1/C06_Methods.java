package L1_StarterLevel.C7_Methods.Chapter1;

public class C06_Methods {
    static int add(int summand1, int summand2) {
    return summand1 + summand2;
    }

    public static void main(String[] args){
        int summand1 = 3, summand2 = 5;

        int sum = add(summand1, summand2);

        System.out.println(summand1 + " + " + summand2 + " = " + sum);
    }
}
