package chapter05;

public class ex05 {
    public static void main(String[] args) {
        /*
        利用for，输出1-100中9的倍数，统计个数及总和
         */
        int nums = 0;
        int sums = 0;
        for (int j = 1;j <= 100;j++){
            if (j % 9 == 0){
                nums += 1;
                sums += j;
            }
        }
        System.out.println("个数为：" + nums);
        System.out.println("总和为：" + sums);
    }
}
