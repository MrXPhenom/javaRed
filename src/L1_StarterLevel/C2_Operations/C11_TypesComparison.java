package L1_StarterLevel.C2_Operations;

public class C11_TypesComparison {
    public static void main(String []args){
        boolean result1;
        boolean result2;
        boolean result3;

        int a = 1;
        float b = 2.0F;
        result1 = a == b;

        String c = "Hello";
        String d = "Hello";

        result2 = c.equals(a);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(c == d);
    }
}
