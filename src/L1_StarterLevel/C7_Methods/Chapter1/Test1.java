package L1_StarterLevel.C7_Methods.Chapter1;

public class Test1 {
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static double mines(int a, int b){
        double c = b - a;
        return c;
    }

    static String show(){
        return "Result = ";
    }

    public static void main(String[] args){
        int result = add(8, 6);
        double result1 = mines(1, 8);
        System.out.println(result + " " + result1);

        double res = result1 + result;
        System.out.println(show() + res);
    }
}


