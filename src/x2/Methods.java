package x2;

import L2_OOP.test.C03_Incaps.Main;

public class Methods {
//    public static void perymeter(int a){
//        int p = a * 4;
//        System.out.println("Периметр = " + p);
//    }

//    public static double perymeter(int a){
//        double p = 4 * a;
//        return p;
//    }

//    public static double ploshcha(int a){
//        double s = Math.pow(a, 2);
//        return s;
//    }

    public static String plp(double a, double b){
        double s = a * b;
        double p = 2 * (a + b);
        return "S = " + s + "; P = " + p;
    }

    public static void main(String[] args) {

        String result = plp(7, 9);
        System.out.println(result);
//        perymeter(7);
//        System.out.println(perymeter(9));
//        System.out.println(ploshcha(5));
    }
}
