package L1_StarterLevel.C1_Variables;

public class L1_variables {
    public static void main(String[] arg){
        String a = "Kalyushko";
        String b = "Oleksndr";
        String c = a
        +" "
        +
        b;
        byte d = -128;
        byte e = +127;
        short f = -32768;
        short g = +32767;
        int h = -2_147_483_648;
        int j = +2_147_483_647;
        long k = -9_223_372_036_854_775_808L;
        long l = +9_223_372_854_775_807L;
        float m = 0.123456F;
        double n = 0.1234567890123456D;
        boolean o = true;
        boolean o2 = false;
        char p = 'a';
        char p2 = 'A';
        System.out.println(c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n" + j + "\n" + k + "\n" + l + "\n" + m + "\n" + n + "\n" + o + "\n" + o2
                + "\n" + p + "\n" + p2);
    }
}
