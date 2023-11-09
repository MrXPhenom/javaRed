package XFiles;

public class weatherTodayTomorrowBasicCode {
    public static void main(String[] args) {
        String country = " Dublin, Ireland ";
        String today = " Thu, Sep 01 ";
        String yesterday = " Fri, sep 02 ";
        String weatherToday = " clear sky ";
        String weatherYesterday = " light rain ";
        String mark = "/";
        int tempDay = 18;
        int tempNight = 13;
        System.out.println(" ");
        System.out.println(country + "" + "\n" + today + "\t\t\t\t\t" + tempDay
                + "\u00b0C" + mark
                + tempNight + "\u00b0C" + "\t" + "\uD83C\uDF1E" + weatherToday );
        tempDay = 20;
        tempNight = 13;
        System.out.println(yesterday + "\t\t\t\t\t" + tempDay + "\u00b0C" + mark
                + tempNight + "\u00b0C" + "\t" + "\u2614" +weatherYesterday);
    }
}
