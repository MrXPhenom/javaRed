package L2_OOP.test.C08_Interface;

import java.util.Scanner;

public interface Mult {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    double mult(double a, double b);
}
