package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a < b)&&(b < c)){
            System.out.println(b + c);
        }else if((a > b)&&(b < c)){
            System.out.println(a + c);
        }else{
            System.out.println(a + b);
        }
    }
}
