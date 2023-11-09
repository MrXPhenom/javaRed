package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = 0;

        if((a < b)&&(b < c)){
            m = b;
        }else if((b < a)&&(b < c)){
            m = a;
        }else{
            m = c;
        }
        System.out.println(m);
    }
}
