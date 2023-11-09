package XFiles.polymorphismTest.WeatherSwitchOOP;

import java.util.Scanner;

public class Main {
    public static final String WHITE = "\033[0;97m";

    public static void main(String []args) {
        String question1 = WHITE + "Input the day";
        System.out.println(question1);
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        Mon mon = new Mon();
        Tue tue = new Tue();
        Wed wed = new Wed();
        Thu thu = new Thu();
        Fri fri = new Fri();
        Sat sat = new Sat();
        Sun sun = new Sun();
        switch (day) {
            case "mon" -> mon.mon();

            case "tue" -> tue.tue();

            case "wed" -> wed.wed();

            case "thu" -> thu.thu();

            case "fri" -> fri.fri();

            case "sat" -> sat.sat();

            case "sun" -> sun.sun();

            default -> System.out.println("Incorrect input");
        }
        String exit = "Have a nice day!";
        System.out.println(WHITE + exit);
    }
}
