package L1_StarterLevel.C6_Arrays;

public class C07_TwoDimensionalArraysFill {
    public static void main(String[] args){
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(array);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}
