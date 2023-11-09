package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Subtraction extends Calculate{
    public void sub(){
        System.out.println("Input a then b:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = (a - b);
        System.out.println("Result: " + x);
    }
}
