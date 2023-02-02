package chapter05;

public class ex06 {
    public static void main(String[] args){
        /*
        输出0+5=5 1+4=5   。。。 5+0=5
         */
        int sums = 5;
        for (int i = 0;i <= sums;i++){
            System.out.println(i + " + " + (sums - i) + " = " + sums);
        }
    }


}
