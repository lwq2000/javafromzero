package chapter05;

public class hw06 {
    public static void main(String[] args){
        /*
        输出1-100之间的不能被5整除的数，每5个一行
         */
        int left = 1;
        int right = 100;
        int count = 0;
        for (; left <= right; left++){
            if (left % 5 != 0){
                System.out.print(left + " ");
                count++;
            }
            if (count == 5){
                System.out.println();
                count = 0;
            }
        }
    }
}
