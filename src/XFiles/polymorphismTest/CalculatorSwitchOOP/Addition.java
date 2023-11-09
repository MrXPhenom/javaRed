package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Addition extends Calculate{
    public void add(){
        System.out.println("Input a then b:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + x);
    }
}
