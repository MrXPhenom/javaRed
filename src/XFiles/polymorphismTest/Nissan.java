package XFiles.polymorphismTest;

public class Nissan extends Cars{
    public void myModel() {
        super.myModel();
        System.out.println("Nissan Skyline GT-R LE '02");
    }
    public void myColor() {
        super.myColor();
        System.out.println("Orange");
    }
    public void price() {
        super.price();
        String price = "73,000";
        System.out.println("$" + price);
    }
}
