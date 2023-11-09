package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double t = 0;
        double t2 = 0;

        if(a > b){
            t = a;
            t2 = b;
            b = t;
            a = t2;
        }
        System.out.println(a + " " + b);
    }
}
