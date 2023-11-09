package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a % b;
        System.out.println(c);
    }
}
