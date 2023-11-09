package TasksL1.TasksLine_Starter_6_loops;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 1;

        for (int i = a; i <= b; i++){
            s *= i;
        }
        System.out.println(s);
    }
}
