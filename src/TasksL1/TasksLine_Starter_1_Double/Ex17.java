package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input A");
        double a = sc.nextDouble();
        System.out.println("Input B");
        double b = sc.nextDouble();
        System.out.println("Input C");
        double c = sc.nextDouble();

        double ac = c - a;
        double bc = c - b;
        double m = ac * bc;
        System.out.println("m = " + m);
    }
}
