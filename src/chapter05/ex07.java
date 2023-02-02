package chapter05;

public class ex07 {
    public static void main(String[] args){
        /*
        输出1-100被3整除的数 while
         */
        int start = 1;
        int end = 100;
        int factor = 3;
        while (start <= end){
            if (start % factor == 0){
                System.out.println(start);
                start += factor;
            }else {
                start += 1;
            }
        }
    }


}
