package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = 0;

        if((a == b)&&(a != c)){
            r = 3;
            System.out.println(r);
        }else if((a == c)&&(a != b)){
            r = 2;
            System.out.println(r);
        }else{
            r = 1;
            System.out.println(r);
        }
    }
}
