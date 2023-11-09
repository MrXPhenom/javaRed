package XFiles.polymorphismTest;

public class Ferrari extends Cars{
    public void myModel() {
        System.out.println("Ferrari FXX-K Evo '18");
    }
    public void myColor(){
        super.myColor();
        System.out.println("Red");
    }
    public void price(){
        super.price();
        String price = "2,177,500";
        System.out.println("$" + price);}
}
