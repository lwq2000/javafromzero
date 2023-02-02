package chapter04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        /*
        利用switch，根据输入的成绩，大于60输出合格，小于60输出不合格，成绩0-100
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double c1 = myScanner.nextDouble();
        if (c1 >=0 && c1 <= 100) {
            switch ((int) (c1 / 60)) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
            }
        }else {
            System.out.println("输入错误");
        }
        System.out.println("程序结束");
    }


}
