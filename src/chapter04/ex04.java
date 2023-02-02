package chapter04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        /*
        利用switch，根据输入月份，输出季节，hint：case穿透
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个月份（1-12）：");
        int c1 = myScanner.nextInt();
        if (c1 >= 1 && c1 <= 12){
            switch(c1){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
            }
        }else{
            System.out.println("输入错误");
        }

        System.out.println("程序结束");
    }


}
