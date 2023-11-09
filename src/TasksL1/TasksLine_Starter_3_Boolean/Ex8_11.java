package TasksL1.TasksLine_Starter_3_Boolean;

import java.util.Scanner;

public class Ex8_11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean b1 = (a % 2 == 1) && (b % 2 == 1);                                              //ex8
        boolean b2 = (a % 2 == 0) || (b % 2 == 0);                                              //ex9
        boolean b3 = ((a % 2 == 0) && (b % 2 == 1)) || ((a % 2 == 1) && (b % 2 == 0));          //ex10
        boolean b4 = ((a % 2 == 0) && (b % 2 == 0)) || ((a % 2 == 1) && (b % 2 == 1));          //ex11
        System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4);
    }
}
