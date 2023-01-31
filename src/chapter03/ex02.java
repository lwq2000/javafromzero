package chapter03;

public class ex02 {
    public static void main(String[] args){
        /*
        % / 取模取余
         */
        int days = 234;
        int weeks = days / 7;
        int remaindays = days % 7;
        System.out.println("剩余"+weeks+"星期"+remaindays+"天");

        /*
        公式 a = 5 / 9 * (b - 100)
         */
        double b = 234.5;
        double a = 5.0 / 9 * (b - 100);
        System.out.println(a);

    }
}
