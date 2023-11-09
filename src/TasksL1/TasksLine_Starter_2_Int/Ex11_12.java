package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex11_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d = n / 10 % 10;        //десятки
        int o = n % 10;             //одиниці
        int s = n / 100;            //сотні
        int sum = o + d + s;
        int mn = o * d * s;
        int r = s + (d * 10) + (o * 100);
        System.out.println(sum + "\n" + mn + "\n" + r);
    }
}
