package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        double a = sc.nextDouble();         //for copy the line press CTRL + B
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double V = a * b * c;
        double S = 2 * ((a * b) + (b * c) + (a * c));
        System.out.println("V = " + V + "\n" + "S = " + S);
    }
}
