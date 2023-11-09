package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        double V = Math.pow(a, 3);
        double S = Math.pow(a, 2) * 6;
        System.out.println("V = " + V + " S = " + S);
    }
}
