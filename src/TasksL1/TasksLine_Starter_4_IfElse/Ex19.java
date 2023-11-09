package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int r = 0;

        if((b == c)&&(c == d)&&(a != b)){
            r = 1;
            System.out.println(r);
        }else if((a == c)&&(c == d)&&(a != b)){
            r = 2;
            System.out.println(r);
        }else if((a == b)&&(b == d)&&(a != c)){
            r = 3;
            System.out.println(r);
        }else{
            r = 4;
            System.out.println(r);
        }
    }
}
