package L1_StarterLevel.C7_Methods.Chapter1;

public class C07_overloadedParametersTest {
    static int add(int a){
        return a;
    }
    static double add(double a, double b){
        double c = a + b;
        return c;
    }
    static int add(int a, int b){
        int c = a + b;
        return c;
    }
//    static int add(double a){
//        double c = a+1;
//        return (int) c;
//    }
//    static double add(double a){
//        double c = a + 1;
//        return c;
//}

    static void add(){
        int c = add(7,7);
        double c1 = add(7.7,5.5);
        double r = c + c1;
        System.out.println(r);
    }

    public static void main(String[] args){
        System.out.println(add(3.2, 5.9) + "\n" + add(15, 49));
        add();
    }

}
