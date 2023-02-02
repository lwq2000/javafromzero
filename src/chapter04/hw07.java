package chapter04;

public class hw07 {
    public static void main(String[] args){
        /*
        输出小写的a-z以及大写的A-Z
         */
        char small = 'a';
        char big = 'A';
        for (int i = 0; i <= 1; i++){
            for ( int j = 0; j <= 25; j++){
                if (i == 0){
                    System.out.print((char) (small + j));
                }else {
                    System.out.print((char) (big + j));
                }
            }
            System.out.println();
        }
    }
}
