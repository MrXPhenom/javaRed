package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();

        double tmp = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(tmp);
        double p = a + b + c;
        System.out.println("C = " + c + "\n" + "P = " + p);
    }
}
