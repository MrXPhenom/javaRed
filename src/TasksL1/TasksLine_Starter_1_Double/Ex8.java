package TasksL1.TasksLine_Starter_1_Double;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        double AVG = (a + b) / 2;                   //AVG -- середнє арифметичне
        System.out.println("AVG = " + AVG);
    }
}
