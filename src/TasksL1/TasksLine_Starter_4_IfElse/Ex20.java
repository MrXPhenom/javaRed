package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((c - a)<(b - a)){
            int r = c - a;
            System.out.println(r +" "+ c);
        }else if((c - a)>(b - a)){
            int r = b - a;
            System.out.println(r +"\n"+ b);
        }
    }
}
