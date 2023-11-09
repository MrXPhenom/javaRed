package L1_StarterLevel.C2_Operations;

public class C2_Casting {
    public static void main(String[] arg){
        byte a = 10;    //                                      0000 1010   -   1 byte
        int b = 0;      // 0000 0000    0000 0000   0000 0000   0000 0000   -   4 bytes
        b = a;          // 0000 0000    0000 0000   0000 0000   0000 1010   -   4 bytes

        System.out.println("int b = " + b);

        int c = 255;
        float d = 0f;
        d = c;

        System.out.println("float d " + d);

        int e = 128;
        byte f = 0;
        f = (byte)e;
        // f = e - error
        System.out.println("byte f " + f);

        float g = 10.5f;
        int h = 0;
        h = (int)g;
        //h = g - error
        System.out.println("Int h "+ h);

        final int i = 127;
        byte j = 0;
        j = i;

        System.out.println("byte j "+ j);

        final float k = 255;
        byte l = 0;
        l = (byte)k;

        System.out.println("Byte l " + l);

        Math.max(3, 7);     //max value from two numbers
        Math.min(2, 4);     //min value from two numbers
        Math.sqrt(9);       //the square root of a number
    }
}
