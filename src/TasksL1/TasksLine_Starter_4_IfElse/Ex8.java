package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a + " " + b);
        }else{
            System.out.println(b + " " + a);
        }
    }
}
