package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        double R = sc.nextDouble();
        double L = 2 * Math.PI * R;
        double S = Math.PI * (Math.pow(R, 2));
        System.out.println("L = " + L + "\n" + "S = " + S);
    }
}
