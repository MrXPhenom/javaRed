package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = 7;                              //int a = sc.nextInt();

        if(a > 0){
        a++;                                    //System.out.println(a + 1);
        }else {
        a = a;                                  //System.out.println(a);
        }
        System.out.println(a);
    }
}
