package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Sat extends City{

    String sat = BLUE
            + "Sat, Aug 29 - " + "\t" + "\uD83C\uDF26\uFE0F" +
            "\t\t" + "29 / 15°C";

    public void sat(){
        super.city();
        System.out.println(sat);
    }
}
