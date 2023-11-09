package L1_StarterLevel.C2_Operations;

public class C8_LocalAndGlobalVariables {
    public static void main(String []args){
        {
            int a = 1;
            System.out.println(a);      //local variable
        }
        {
            int a = 2;
            System.out.println(a);
        }

        int a = 3;
        System.out.println(a);          //global variable
    }
}