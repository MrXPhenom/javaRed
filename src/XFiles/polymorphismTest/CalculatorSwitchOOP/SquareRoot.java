package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class SquareRoot extends Calculate{
    public void sqrt(){
        System.out.println("Input your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = Math.sqrt(n);
        System.out.println("Square root from " + n + " = " + x);
    }
}
