package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input S");
        double S = sc.nextDouble();
        double pi = 3.14;
        double R = Math.sqrt(S / pi);
        double D = R * 2;
        double L = 2 * pi * R;
        System.out.println("D = " + D + "\n" + "L = " + L);
    }
}
