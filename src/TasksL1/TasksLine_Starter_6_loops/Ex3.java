package TasksL1.TasksLine_Starter_6_loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            //a < b
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0;

        for (int i = (b - 1); i > a; i--) {
            System.out.println(i);
            n++;
        }
        System.out.println("\n" + n);
    }
}
