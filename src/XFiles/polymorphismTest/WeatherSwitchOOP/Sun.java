package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Sun extends City{

    String sun = RED_BOLD
            + "Sun, Aug 28 - " + "\t" + "\u2600\uFE0F" + "\t" + "32 / 18°C";

    public void sun(){
        super.city();
        System.out.println(sun);
    }
}
