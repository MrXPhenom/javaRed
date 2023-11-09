package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();
        System.out.println("Input c");
        int c = sc.nextInt();
        int r = 0;
        int r2 = 0;

        if ((a > 0) && (b > 0) && (c > 0)) {
            r = 3;
            r2 = r2;
        }
        if ((a > 0) && (b > 0) && (c < 0)) {
            r = 2;
            r2 = 1;
        }
        if ((a > 0) && (b < 0) && (c > 0)) {
            r = 2;
            r2 = 1;
        }
        if ((a < 0) && (b > 0) && (c > 0)) {
            r = 2;
            r2 = 1;
        }
        if ((a > 0) && (b < 0) && (c < 0)) {
            r = 1;
            r2 = 2;
        }
        if ((a < 0) && (b < 0) && (c > 0)) {
            r = 1;
            r2 = 2;
        }
        if ((a < 0) && (b < 0) && (c < 0)) {
            r = 0;
            r2 = 3;
        }
        System.out.println("Додатніх чисел = " + r + "\n" + "Мінусових чисел = " + r2);
    }
}
