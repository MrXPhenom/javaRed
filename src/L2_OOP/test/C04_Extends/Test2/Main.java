package L2_OOP.test.C04_Extends.Test2;

public class Main {
    public static void main(String[] args){
        car BMW = new car();
        BMW.Mark = "BMW";
        BMW.Price = 50000;
        BMW.Model = "X5";
        BMW.Speed = 250;
        System.out.println(BMW.Mark + "\n" + BMW.Price + "\n" + BMW.Model + "\n" + BMW.Speed);
    }
}
