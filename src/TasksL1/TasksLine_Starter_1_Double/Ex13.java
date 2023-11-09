package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input R1");
        double R1 = sc.nextDouble();
        System.out.println("Input R2");
        double R2 = sc.nextDouble();
        double S1 = Math.pow(R1, 2) * Math.PI;
        double S2 = Math.pow(R2, 2) * Math.PI;
        double S3 = S1 - S2;
        System.out.println("S1 = " + S1 + "\n" + "S2 = " + S2 + "\n" + "S3 = " + S3);
    }
}
