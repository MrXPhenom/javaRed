package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input R");
        double R = sc.nextDouble();
        double pi = 3.14;

        double L = 2 * pi * R;
        double S = Math.pow(R, 2) * pi;

        System.out.println("L = " + L + "\n" + "S = " + S);
    }
}
