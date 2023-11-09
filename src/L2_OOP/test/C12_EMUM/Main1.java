package L2_OOP.test.C12_EMUM;

public class Main1 {
    enum Level {

        LOW,

        MEDIUM,

        HIGH

    }

    public static void main(String[] args) {

        Level myVar = Level.MEDIUM;



        switch(myVar) {

            case LOW:

                System.out.println("Low level");

                break;

            case MEDIUM:

                System.out.println("Medium level");

                break;

            case HIGH:

                System.out.println("High level");

                break;

        }

        for (Level myVar1 : Level.values()) {

            System.out.println(myVar1);

        }

    }
}
