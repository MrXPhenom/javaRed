package TasksL1.TasksLine_Starter_5_Switch;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double a = sc.nextInt();
        double b = sc.nextInt();

        switch (number){
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
