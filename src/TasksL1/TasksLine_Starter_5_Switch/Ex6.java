package TasksL1.TasksLine_Starter_5_Switch;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int a = 1;

        switch(number){

            case ("1"):{
                System.out.println(a + " dm");
                break;
            }
            case ("2"):{
                System.out.println(a + " km");
                break;
            }
            case ("3"):{
                System.out.println(a + " m");
                break;
            }
            case ("4"):{
                System.out.println(a + " mm");
                break;
            }
            case ("5"):{
                System.out.println(a + " cm");
                break;
            }
            default:{
                System.out.println("Wrong input");
            }
        }
    }
}
