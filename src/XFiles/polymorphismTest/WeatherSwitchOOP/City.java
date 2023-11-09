package XFiles.polymorphismTest.WeatherSwitchOOP;

public class City {
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String WHITE = "\033[0;97m";

    String city = GREEN + "\t" + "\uD83C\uDF0E" + "\t" + "Pittsburgh, PA:";

    public void city(){
        System.out.println(city);
    }
}
