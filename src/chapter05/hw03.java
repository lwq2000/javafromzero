package chapter05;

public class hw03 {
    public static void main(String[] args){
        /*
        闰年
         */
        int year = 2100;
        if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
