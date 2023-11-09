package XFiles.polymorphismTest;

public class Chevrolet extends Cars{
    public void myModel() {
        super.myModel();
        System.out.println("Chevrolet Corvette Grand Sport '17");
    }
    public void myColor() {
        super.myColor();
        System.out.println("Grey");
    }
    public void price() {
        super.price();
        String price = "91,000";
        System.out.println("$" + price);
    }
}
