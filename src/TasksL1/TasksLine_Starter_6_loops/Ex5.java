package TasksL1.TasksLine_Starter_6_loops;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double p = 177.55;
        for (double i = 0.1; i <= 1; i += 0.1){
            double tp = i * p;
            System.out.println(tp);
        }
    }
}

