package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Division extends Calculate{
    public void div() {
        System.out.println("Input a then b:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = a / b;
        System.out.println("Division of " + a + " on " + b + " = " + x);
    }
}
