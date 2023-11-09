package TasksL1.TasksLine_Starter_3_Boolean;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean b1 =(a < b)&&(b < c);

        System.out.println(b1);
    }

}
