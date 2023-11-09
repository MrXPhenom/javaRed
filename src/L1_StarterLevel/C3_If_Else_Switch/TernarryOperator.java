package L1_StarterLevel.C3_If_Else_Switch;

//тернарний оператор: якщо іде по гілці True то в змінну c запише значення a, якщо False - то b

public class TernarryOperator {
    public static void main(String[] args){
        int a = 7, b = 8, c = 0;

        c = (a > b) ? a : b;
        System.out.println(c);
    }
}
