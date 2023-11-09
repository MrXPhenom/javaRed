package TasksL1.TasksLine_Starter_4_IfElse;

public class Ex4 {
    public static void main(String[] args){
        int a = -7, b = -3, c = -5, r = 0;

        if((a > 0)&&(b > 0)&&(c > 0)){
            r = 3;
        }if((a > 0)&&(b > 0)&&(c < 0)){
            r = 2;
        }if((a > 0)&&(b < 0)&&(c > 0)){
            r = 2;
        }if((a < 0)&&(b > 0)&&(c > 0)){
            r = 2;
        }if((a > 0)&&(b < 0)&&(c < 0)){
            r = 1;
        }if((a < 0)&&(b < 0)&&(c > 0)){
            r = 1;
        }if((a < 0)&&(b < 0)&&(c < 0)){
            r = 0;
        }
        System.out.println(r);
    }
}
