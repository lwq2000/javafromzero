package chapter05;

public class hw01 {
    public static void main(String[] args){
        /*
        某人有100000元，每经过一次路口，需要交费，规则如下：
        1）现金>50000时，每次交5%
        2）现金<=50000时，每次交1000
        计算某人可以经过多少次路口，要求使用while break
         */
        double money = 100000;
        double rate = 0.05;
        double n = 1000;
        int count = 0;
        while (money>=n){
            if (money > 50000){
                money *= (1 - rate);
            }else {
                money -= n;
            }
            count++;
        }
        System.out.println(count);
    }
}
