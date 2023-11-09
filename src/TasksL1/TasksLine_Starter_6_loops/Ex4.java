package TasksL1.TasksLine_Starter_6_loops;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double p = 177.75;//sc.nextDouble();

        for (int i = 1; i < 10; i++) {
            double tp = i * p;
            System.out.println(tp);
        }
    }
}
