package L1_StarterLevel.C7_Methods.Chapter1;

import java.util.Scanner;

public class TestMethods {
    static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    static void Min(int a, int b){
        int min = 0;
        if (a < b){
            min = a;
        }else{
            min = b;
        }
        System.out.println(min);

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int e = sc.nextInt();
        add(5, 7);
//        int q = 4, e = 8;
        add(q, e);
        Min(5, 9);
    }
}
