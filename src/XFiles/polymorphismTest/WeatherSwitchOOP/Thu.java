package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Thu extends City{

    String thu = BLUE
            + "Thu, Sep 01 - " + "\t" + "\uD83C\uDF26\uFE0F" + "\t\t" + "25 / 14°C";

    public void thu(){
        super.city();
        System.out.println(thu);
    }
}
