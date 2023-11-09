package TasksL1.TasksLine_Starter_3_Boolean;

import java.util.Scanner;

public class Ex4_5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean b1 = (a > 2) && (b <= 3);

        boolean b2 = (a >= 0) || (b < -2);

        System.out.println("b1 = " + b1 + "\n" + "b2 = " + b2);

    }

}
