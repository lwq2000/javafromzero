package chapter05;

public class hw08 {
    public static void main(String[] args){
        /*
        求出1 - 1/2 + 1/3 - 1/4 。。。 1/100
         */
        double sum = 0;
        int end = 100;
        for (int i = 1; i <= end; i++){
            if (i % 2 == 0){
                sum -= 1.0 / i;
            }else {
                sum += 1.0 / i;
            }

        }
        System.out.println(sum);
    }
}
