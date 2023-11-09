package XFiles;

import java.util.Scanner;

public class yearOfBirthFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year \"Now\"");
        int now = sc.nextInt();
        System.out.println("Input year of birth");
        int yob = sc.nextInt();
        int yearsNow = (now - yob);
        int twoYearsAgo = (now - yob - 2);
        System.out.println("Now person is " + yearsNow + " years old" + "\n" + "Two years ago person was " + twoYearsAgo + " years old");
    }
}
