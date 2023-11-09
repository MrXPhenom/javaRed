package TasksL1.TasksLine_Starter_4_IfElse;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(((a > b)&&(b > c))||((a < b)&&(b < c))){
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println(a +" "+ b +" "+ c);
        }else{
            a *= -1;
            b *= -1;
            c *= -1;
            System.out.println(a +" "+ b +" "+ c);
        }
    }
}
