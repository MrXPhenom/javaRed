package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a, b) + " " + (Math.min(a, b)));
    }
}
