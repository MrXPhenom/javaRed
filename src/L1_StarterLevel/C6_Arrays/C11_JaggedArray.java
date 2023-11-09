package L1_StarterLevel.C6_Arrays;

public class C11_JaggedArray {
    public static void main(String[] args){
        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{1, 2, 3, 4, 5};
        jagged[2] = new int[]{1, 2, 3};

        for (int i = 0; i < jagged.length; ++i){

            for (int j = 0; j < jagged[i].length; ++j){

                System.out.print(" " + jagged[i][j]);
            }
            System.out.print("\n");
        }
    }
}
