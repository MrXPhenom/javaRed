package TasksL1.TasksLine_Starter_2_Int;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int kg = sc.nextInt();
        int t = kg / 1_000;

        System.out.println(t + " ton");
    }
}
