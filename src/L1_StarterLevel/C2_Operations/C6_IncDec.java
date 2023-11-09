package L1_StarterLevel.C2_Operations;

public class C6_IncDec {
    public static void main(String[] args){
        System.out.println("Постфіксний інкремент");        //при постфіксному інкременті зміниться з наступного рядка

        byte number1 = 0;
        System.out.println(number1++);
        System.out.println(number1);

        System.out.println("Префіксний інкремент");
        byte number2 = 0;
        System.out.println(++number2);

        System.out.println("Префіксний декремент");         //при префіксному інкрументі зміни настануть одразу
        byte number3 = 0;
        System.out.println(--number3);

        System.out.println("Постфіксний декремент");
        byte number4 = 0;
        System.out.println(number4--);
        System.out.println(number4);

        System.out.println("Math example");
        int a = 5, b = 7;
        int c = a++ - --b + ++a + b++ + b - ++a - --a;      // 5-6+6+6-7-6=4
        System.out.println(c);
    }
}
