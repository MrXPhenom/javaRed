package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Exponentiation extends Calculate{
    public void exp(){
        System.out.println("Input a then b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = (int) Math.pow(a, b);
        System.out.println("Exponentiation of " + a + " to " + b + " = " + x);
    }
}
