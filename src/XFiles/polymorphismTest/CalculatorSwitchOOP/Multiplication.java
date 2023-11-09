package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Multiplication extends Calculate{
    public void mult() {
        System.out.println("Input a then b:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = a * b;
        System.out.println("Multiplication of " + a + " on " + b + " = " + x);
    }
}
