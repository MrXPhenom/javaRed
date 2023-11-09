package L1_StarterLevel.C2_Operations;

public class C4_Math {
    public static void main(String[] args){
        double a = 2, b = 7;
        double res = Math.pow(a, b);    //воззведення до степеня
        System.out.println(res);

        double x = 256;
        double res2 = Math.sqrt(x);     //корінь квадратний
        System.out.println(res2);

        double y = -777;
        double res3 = Math.abs(y);      //модуль числа, завжди додатній

        System.out.println(res3);
    }
}
