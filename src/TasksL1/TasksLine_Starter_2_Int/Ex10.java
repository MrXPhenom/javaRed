package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n / 10;
        int b = a % 10;
        int c = n % 10;

        int x = (c * 10) + b;
        System.out.println(x);
    }
}
