package chapter05;

public class ex08 {
    public static void main(String[] args){
        /*
        输出40-200所有偶数 while
         */
        int start = 40;
        int end = 200;
        int factor = 2;
        while (start <= end){
            if (start % factor == 0){
                System.out.println(start);
                start += factor;
            }else {
                start++;
            }
        }
    }


}
