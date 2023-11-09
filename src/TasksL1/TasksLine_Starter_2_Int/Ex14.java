package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = n / 100;
        int d = n / 10 % 10;
        int o = n % 10;
        int j = (o * 100) + (s * 10) + d;
        System.out.println(j);
    }
}
