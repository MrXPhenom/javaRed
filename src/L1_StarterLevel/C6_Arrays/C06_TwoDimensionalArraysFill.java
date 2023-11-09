package L1_StarterLevel.C6_Arrays;

public class C06_TwoDimensionalArraysFill {
    public static void main(String[] args){
        int sizeI = 3;
        int sizeJ = 3;
        int array[][] = new int[sizeI][sizeJ];

        //filling massive
        for(int i = 0; i < sizeI; i++){
            for(int j = 0; j < sizeJ; j++){
                array[i][j] = i * j + 1;
                System.out.print(" " + array[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < sizeI; i++){
            for (int j = 0; j < sizeJ; j++){
                System.out.println(" " + array[i][j]);
            }
            System.out.println("\n");
        }
    }
}
