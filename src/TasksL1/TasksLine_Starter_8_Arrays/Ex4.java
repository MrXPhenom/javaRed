package TasksL1.TasksLine_Starter_8_Arrays;

public class Ex4 {
    public static void main(String[] args){
        int [] arr = {-7, 7, 9, 33, 77, -58, 43, -108};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);
    }
}
