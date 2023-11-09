package L1_StarterLevel.C2_Operations;

public class C10_StringFormat {
    public static void main(String []args){
        int a = 1, b = 2, c = 3;
        System.out.println("Це число " + a);

        System.out.println(String.format("Це число %1$s", a));

        System.out.printf("Це числа %1$s та %2$S \n", b, c);
        System.out.printf("Це числа навпаки %2$S та %1$s", b, c);
    }
}
