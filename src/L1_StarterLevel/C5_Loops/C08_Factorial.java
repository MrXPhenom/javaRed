package L1_StarterLevel.C5_Loops;

import java.util.Scanner;
public class C08_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int factorial = 1;

        System.out.println("Factorial of the number " + counter + "! = ");

        do{
            factorial *= counter--;
        }while(counter > 1);

        System.out.println(factorial);
    }
}
