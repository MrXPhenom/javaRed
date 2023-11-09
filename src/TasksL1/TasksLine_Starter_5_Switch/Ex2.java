package TasksL1.TasksLine_Starter_5_Switch;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        switch (number){
            case "1":{
                System.out.println("E");
            break;
            }
            case "2":{
                System.out.println("D");
                break;
            }
            case "3":{
                System.out.println("C");
                break;
            }
            case "4":{
                System.out.println("B");
                break;
            }
            case "5":{
                System.out.println("A");
                break;
            }
            default:{
                System.out.println("Incorrect number");
            }
        }
    }
}
