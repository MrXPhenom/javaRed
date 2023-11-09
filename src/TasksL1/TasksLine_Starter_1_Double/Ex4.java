package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        System.out.println("Input d");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double PI = 3.14;
//      double L = PI * d;
        double L = Math.PI * d;
        System.out.println("L = " + L);
    }
}
