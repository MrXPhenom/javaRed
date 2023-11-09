package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Tue extends City{

    String tue = BLUE
            + "Tue, Aug 30 - " + "\t" + "\u2601\uFE0F" + "\t" + "24 / 19°C";

    public void tue(){
        super.city();
        System.out.println(tue);
    }
}
