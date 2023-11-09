package L2_OOP;

public class Demo {
    int x = 777;

    public static void main(String[] args) {
        Demo Obj = new Demo();
        Demo Obj1 = new Demo();
        System.out.println(Obj.x);
        Obj.x = 888;
        System.out.println(Obj.x);
        Obj.x = 333;
        System.out.println(Obj.x);
        Obj1.x = 555;
        System.out.println(Obj1.x);
    }
}

class Second{
    public static void main(String[] args) {
        Demo main = new Demo();
        System.out.println(main.x);
    }
}
