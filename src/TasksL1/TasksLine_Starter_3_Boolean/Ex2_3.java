package TasksL1.TasksLine_Starter_3_Boolean;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean b = (a % 2 == 0);

        boolean b1 = (a % 2 == 1);

        System.out.println(b + "\n" + b1);
    }

}
