package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        double Sum = a + b;
        double Minus = a - b;
        double Mult = a * b;
        double Div = a / b;
        double KvSum = (Math.pow(a, 2) + (2 * a * b) + (Math.pow(b, 2)));
        double KvMines = (Math.pow(a, 2) - (2 * a * b) + (Math.pow(b, 2)));
        System.out.println("KvSum = " + KvSum + "\n" + "KvMines = " + KvMines);
    }
}
