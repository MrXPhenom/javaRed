package TasksL1.TasksLine_Starter_4_IfElse;

public class Ex3 {
    public static void main(String[] args){
        int a = 0;
        if (a > 0){
            a++;
        }else if(a==0){
            a = 10;
        }else{
            a -= 2;
        }
        System.out.println(a);
    }
}
