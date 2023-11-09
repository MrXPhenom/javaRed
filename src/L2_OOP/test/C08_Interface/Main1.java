package L2_OOP.test.C08_Interface;

public class Main1 implements Add, Minus, Mult{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        System.out.println(main1.add(7, 5));
        System.out.println(main1.minus(8, 3));
        System.out.println(main1.mult(6, 7));
    }
}
