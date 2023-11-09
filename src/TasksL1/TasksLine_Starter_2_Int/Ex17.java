package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int j = n / 100 % 10;
        System.out.println(j);
    }
}
