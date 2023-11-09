package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input temperature in Fahrenheit scale");
        double tf = sc.nextDouble();
        double b = 5;
        double c = 9;
        double a = b / c;
        double tc =(tf - 32) * a;
        System.out.println("Temperature in Celsium is " + tc);
    }
}
