package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input some number");
        double a = sc.nextDouble();
//      double S = Math.pow(a, 2);
        double S = a * a;
        System.out.println("S = " + S);
    }
}
