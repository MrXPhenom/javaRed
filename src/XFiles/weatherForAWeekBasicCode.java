package XFiles;

public class weatherForAWeekBasicCode {public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String RED_BOLD = "\033[1;31m";
    public static void main(String[] cityWeather) {
        String city = GREEN + "\t" + "\uD83C\uDF0E" + "\t" + "Pittsburgh, PA:";
        String sun = BLUE + "\n"
                + "Sun, Aug 28 - " + "\t" + "\u2600\uFE0F" + "\t" + "32 / 18°C";
        String mon = "\n"
                + "Mon, Aug 29 - " + "\t" + "\u2600\uFE0F" + "\t" + "34 / 21°C";
        String tue = "\n"
                + "Tue, Aug 30 - " + "\t" + "\u2601\uFE0F" + "\t" + "24 / 19°C";
        String wed = "\n"
                + "Wed, Aug 31 - " + "\t" + "\u2600\uFE0F" + "\t" + "26 / 15°C";
        String thu = "\n"
                + "Thu, Sep 01 - " + "\t" + "\uD83C\uDF26\uFE0F" + "\t\t" + "25 / 14°C";
        String fri = "\n"
                + "Fri, Sep 02 - " + "\t" + "\uD83C\uDF26\uFE0F" + "\t\t" + "26 / 11°C";
        String sat = "\n" +
                RED_BOLD + "Sat, Aug 29 - " + "\t" + "\uD83C\uDF26\uFE0F" +
                "\t\t" + "29 / 15°C";
        String weather = city + sun + mon + tue + wed + thu + fri + sat;
        System.out.println(weather);
    }
}
