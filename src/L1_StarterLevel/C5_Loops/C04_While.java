package L1_StarterLevel.C5_Loops;

import java.util.Scanner;

public class C04_While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while(i < 3){
            i++;
            System.out.println("Counter" + i);
        }
        System.out.println("Processed " + i + " iterations.");
    }
}
