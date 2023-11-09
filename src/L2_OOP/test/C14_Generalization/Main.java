package L2_OOP.test.C14_Generalization;

class myClass<TYPE>{
    public TYPE field;

    public void method(){
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        myClass<String> instance1 = new myClass<>();
        instance1.field = "ABC";
        instance1.method();
        System.out.println(instance1.field);

        myClass<Integer> instance2 = new myClass<>();
        instance2.field = 1234;
        instance2.method();
        System.out.println(instance2.field);

        myClass<Double> instance3 = new myClass<>();
        instance3.field = 3.14;
        instance3.method();
        System.out.println(instance3.field);
    }
}
