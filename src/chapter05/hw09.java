package chapter05;

public class hw09 {
    public static void main(String[] args){
        /*
        求 1 + （1+2） + （1+2+3） + （1+。。+100）
         */
        int left = 1;
        int right = 100;
        int sum = 0;
        for (int i = left; i <= right; i++){
            for (int j = 1; j <= i; j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
