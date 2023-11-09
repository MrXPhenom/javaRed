package XFiles.polymorphismTest;

public class Main {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        Cars myFerrari = new Ferrari();
        Cars myNissan = new Nissan();
        Cars myBMW = new BMW();
        Cars myMers = new Chevrolet();
        myCar.myModel();
        myFerrari.myModel();
        myFerrari.myColor();
        myFerrari.price();
        myBMW.myModel();
        myBMW.myColor();
        myBMW.price();
        myMers.myModel();
        myMers.myColor();
        myMers.price();
        myNissan.myModel();
        myNissan.myColor();
        myNissan.price();

    }
}