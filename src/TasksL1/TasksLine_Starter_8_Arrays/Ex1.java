package TasksL1.TasksLine_Starter_8_Arrays;

public class Ex1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 7, 9, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
