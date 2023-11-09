package XFiles.polymorphismTest.CalculatorSwitchOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Addition Add = new Addition();
        Division Div = new Division();
        Subtraction Sub = new Subtraction();
        Multiplication Mult = new Multiplication();
        SquareRoot Sqrt = new SquareRoot();
        Exponentiation Exp = new Exponentiation();


        System.out.println("""
                Please, choose preferable operation:
                1 for square root
                2 for addition
                3 for subtraction
                4 for multiplication
                5 for division
                6 for exponentiation""");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        switch (g) {
            case 1 -> Sqrt.sqrt();
            case 2 -> Add.add();
            case 3 -> Sub.sub();
            case 4 -> Mult.mult();
            case 5 -> Div.div();
            case 6 -> Exp.exp();
            default -> System.out.println("Wrong input");
        }
    }
    
}
