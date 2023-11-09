package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n / 10;
        int b = n % 10;
        int c = a + b;
        int d = a * b;

        System.out.println("Sum = " + c + "\n" + "Multiplied = " + d);
    }
}
