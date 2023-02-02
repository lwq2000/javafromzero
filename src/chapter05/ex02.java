package chapter05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        /*
        利用switch，根据输入，把char型abcde转为大写，其他的输出"other"
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符（a-e）：");
        char c1 = myScanner.next().charAt(0);
        switch(c1){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
                break;
        }
        System.out.println("程序结束");
    }


}
