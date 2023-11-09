package L1_StarterLevel.C7_Methods.Chapter1;

public class C05_Methods {
    static String function(String name){
        String sentence = "Hello " + name + "!";
        return sentence;
    }

    public static void main(String[] args){
        String sentence = function("World");
        System.out.println(sentence);
    }
}
