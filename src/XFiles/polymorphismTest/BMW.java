package XFiles.polymorphismTest;

public class BMW extends Cars{
    public void myModel() {
        super.myModel();
        System.out.println("BMW M3 GTR LE '06");
    }
    public void myColor() {
        super.myColor();
        System.out.println("White");
    }
    public void price() {
        super.price();
        String price = "202,000";
        System.out.println("$" + price);
    }
}
