package L1_StarterLevel.C2_Operations;

public class C9_Concatenation {
    public static void main(String []args){
        String Word1 = "Hello ";
        String Word2 = "everyone";
        String phrase = Word1+Word2;
        System.out.println(phrase);

        System.out.println("Hello, " + "world!");

        System.out.println(Word1.concat(Word2));
    }
}
