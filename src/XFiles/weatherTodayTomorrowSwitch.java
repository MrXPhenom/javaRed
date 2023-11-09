package XFiles;

import java.util.Scanner;

public class weatherTodayTomorrowSwitch {
    public static void main(String[] args) {
        System.out.println("Weather for today or yesterday");
        String country = " Dublin, Ireland ";
        String today = " Thu, Sep 01 ";
        String yesterday = " Fri, sep 02 ";
        String weatherToday = " clear sky ";
        String weatherYesterday = " light rain ";
        String mark = "/";
        int tempDay = 18;
        int tempNight = 13;

        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        switch (day){

            case "today":{
                System.out.println(country + "" + "\n" + today + "\t\t\t\t\t" + tempDay
                        + "\u00b0C" + mark
                        + tempNight + "\u00b0C" + "\t" + "\uD83C\uDF1E" + weatherToday );
                break;
            }
            case "yesterday":{
                System.out.println(country + "" + "\n" + yesterday + "\t\t\t\t\t" + tempDay + "\u00b0C" + mark
                        + tempNight + "\u00b0C" + "\t" + "\u2614" +weatherYesterday);
                break;
            }

        }
    }
}
