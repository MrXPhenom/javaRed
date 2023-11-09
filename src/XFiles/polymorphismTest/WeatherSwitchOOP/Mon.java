package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Mon extends City{

    String mon = BLUE
            + "Mon, Aug 29 - " + "\t" + "\u2600\uFE0F" + "\t" + "34 / 21°C";

    public void mon(){
        super.city();
        System.out.println(mon);
    }
}
