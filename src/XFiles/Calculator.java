package XFiles;

import java.util.Scanner;

public class Calculator {

    static double sqrt(int n){
        return Math.sqrt(n);
    }

    static int exp(int a, int b){
        return (int) Math.pow(a, b);
    }

    static double add(double a, double b){
        return (a + b);
    }

    static double mines(double a, double b){
        return (a - b);
    }

    static double multiplication(double a, double b){
        return (a * b);
    }

    static double div(double a, double b){
        return (a / b);
    }

    public static void main(String[] args){

        System.out.println("""
                Choose the case:
                1 for square root
                2 for addition
                3 for subtraction
                4 for multiplication
                5 for division
                6 for exponentiation""");
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();

        switch (g) {
            case 1 -> {
                System.out.println("Input your number:");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                double x = sqrt(n);
                System.out.println("Square root from " + n + " = " + x);
//                break;
            }
            case 2 -> {
                System.out.println("Input a then b:");
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double x = add(a, b);
                System.out.println("Sum of " + a + " and " + b + " = " + x);
//                break;
            }

            case 3 -> {
                System.out.println("Input a then b:");
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double x = mines(a, b);
                System.out.println("Subtraction of " + a + " and " + b + " = " + x);
            }
            case 4 -> {
                System.out.println("Input a then b:");
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double x = multiplication(a, b);
                System.out.println("Multiplication of " + a + " on " + b + " = " + x);
            }
            case 5 -> {
                System.out.println("Input a then b:");
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double x = div(a, b);
                System.out.println("Division of " + a + " on " + b + " = " + x);
            }
            case 6 -> {
                System.out.println("Input a then b:");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = exp(a, b);
                System.out.println("Exponentiation of " + a + " to " + b + " = " + x);
            }
        }
//        System.out.println("Do you want to continue?");
//        Scanner yn = new Scanner(System.in);
//        String yn2 = yn.next();
//        switch (yn2) {
//            case "y" -> {
////                return (main (String[] args));
//            }
//            case "n" ->
//                System.out.println("Goodbye!");
//        }
    }
}
