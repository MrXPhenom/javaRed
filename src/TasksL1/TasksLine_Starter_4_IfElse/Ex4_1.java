package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = 0;

        if((a > 0)&&(b > 0)&&(c > 0)){
            r = 3;
        }if((a > 0)&&(b > 0)&&(c < 0)){
            r = 2;
        }if((a > 0)&&(b < 0)&&(c > 0)){
            r = 2;
        }if((a < 0)&&(b > 0)&&(c > 0)){
            r = 2;
        }if((a > 0)&&(b < 0)&&(c < 0)){
            r = 1;
        }if((a < 0)&&(b < 0)&&(c > 0)){
            r = 1;
        }if((a < 0)&&(b < 0)&&(c < 0)){
            r = 0;
        }
        System.out.println(r);
    }
}
