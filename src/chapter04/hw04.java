package chapter04;

public class hw04 {
    public static void main(String[] args){
        /*
        试写出将String转换成double类型的语句，以及将char类型转换成String的语句，举例说明即可，写简单代码
         */
        String str1 = "88.8";
        double s1 = Double.parseDouble(str1);
        char ch1 = 'a';
        String str2 = ch1 + "";
        System.out.println(s1);
        System.out.println(str2);

    }
}
