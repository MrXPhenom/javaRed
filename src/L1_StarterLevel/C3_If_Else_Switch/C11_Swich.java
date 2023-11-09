package L1_StarterLevel.C3_If_Else_Switch;

import java.util.Scanner;

public class C11_Swich {
    public static void main(String[] args){

        System.out.println("Input number 1 or 2");

        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        switch (number) {

            case "1":{
                System.out.println("One");
                break;
            }
            case "2":{
                System.out.println("Two");
                break;
            }
            default: {
                System.out.println("Number is not 1 or 2");
                break;
            }

        }
    }
}
