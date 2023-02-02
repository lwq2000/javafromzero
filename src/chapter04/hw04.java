package chapter04;

public class hw04 {
    public static void main(String[] args){
        /*
        判断一个整数是否是水仙花数，所谓水仙花数是指一个三位数，其各个位上数字立方和等于其本身
         */
        int num = 153;
        int num1 = num;
        int sums = 0;
        while (num != 0){
            int temp = num % 10;
            sums += temp*temp*temp;
            num /= 10;
        }
        if (sums == num1){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}
