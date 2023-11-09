package TasksL1.TasksLine_Starter_7_Arrays;

public class Ex3 {
    public static void main(String[] args){
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] sum = new int[3][3];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                sum[i][j] = array[i][j] + arr[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
