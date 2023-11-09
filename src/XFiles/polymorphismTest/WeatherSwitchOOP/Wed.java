package XFiles.polymorphismTest.WeatherSwitchOOP;

public class Wed extends City{

    String wed = BLUE
            + "Wed, Aug 31 - " + "\t" + "\u2600\uFE0F" + "\t" + "26 / 15°C";

    public void wed(){
        super.city();
        System.out.println(wed);
    }
}
