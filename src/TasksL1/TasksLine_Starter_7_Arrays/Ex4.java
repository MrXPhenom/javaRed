package TasksL1.TasksLine_Starter_7_Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {-7, 7, 9, 33, 77, -58, 43, -100, 1000};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                    min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println(min);
        System.out.println(max);
        }
    }
