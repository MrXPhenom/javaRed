package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int j = n / 1000 % 10;

        System.out.println(j);
    }
}
