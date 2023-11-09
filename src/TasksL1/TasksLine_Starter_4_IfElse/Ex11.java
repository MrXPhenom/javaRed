package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            int m1 = 0;
            a = m1;
            b = m1;
        }
        if(a > b){
            int m2 = a;
            a = m2;
            b = m2;
        }if(a < b){
            int m3 = b;
            a = m3;
            b = m3;
        }

        System.out.println(a +" "+ b);
    }
}
