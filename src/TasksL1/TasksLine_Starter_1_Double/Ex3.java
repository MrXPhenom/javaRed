package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        double S = a * b;
        double P = 2 * (a + b);
        System.out.println("S = " + S + " P = " + P);
    }
}
