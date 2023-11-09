package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(a != b){
            double t = a + b;
            a = t;
            b = t;
            System.out.println(a +" "+ b);
        }
        if(a == b){
            double t2 = 0;
            a = t2;
            b = t2;
            System.out.println(a +" "+ b);
        }

    }
}
