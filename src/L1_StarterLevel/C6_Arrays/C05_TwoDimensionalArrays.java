package L1_StarterLevel.C6_Arrays;

public class C05_TwoDimensionalArrays {
    public static void main(String[] args){
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        System.out.println((array[0][0]) +" "+ (array[0][1]) + " " + (array[0][2]) + "\n" + (array[1][0]) + " " + (array[1][1])
                        + " " + (array[1][2] + "\n" + (array[2][0]) + " " + (array[2][1]) + " " + (array[2][2])));
    }
}
