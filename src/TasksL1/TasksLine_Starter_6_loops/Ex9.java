package TasksL1.TasksLine_Starter_6_loops;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;

        for (double i = a; i <= b; i++){
            double j = Math.pow(i, 2);
            s += j;}
        System.out.println(s);
    }
}
