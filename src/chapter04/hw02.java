package chapter04;
import java.util.Scanner;
public class hw02 {
    public static void main(String[] args){
        /*
        实现判断一个整数，属于哪个范围：大于0，小于0，等于0
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = myScanner.nextInt();
        if (n > 0){
            System.out.println("此数大于0");
        } else if (n < 0) {
            System.out.println("此数小于0");
        }else {
            System.out.println("此数等于0");
        }
    }
}
