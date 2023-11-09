package L2_OOP.test.C03_Incaps;

public class Car {
    private String mark;
    private int price;
    private String color;
    private int speed;

    public Car(String mark, int price, String color, int speed) {
        this.mark = mark;
        this.price = price;
        this.color = color;
        this.speed = speed;
    }

    public Car() {

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


