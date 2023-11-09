package L2_OOP.test.C06_Nested;

class myClass {
    int b = 9;
    public class Nested extends Car{
        int a = 7;
        public void method() {
            System.out.println("Method from a Nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myClass.Nested instance = new myClass().new Nested();
        myClass myClass = new myClass();

        instance.method();
        System.out.println(instance.a);
        System.out.println(myClass.b);
        int sum = instance.a + myClass.b;
        System.out.println(sum);
        instance.Wheels();
        System.out.println(instance.car);
    }
}