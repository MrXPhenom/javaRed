package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x1");
        double x1 = sc.nextDouble();
        System.out.println("Input x2");
        double x2 = sc.nextDouble();
        double L = x2 - x1;
        System.out.println("L = " + L);
    }
}
