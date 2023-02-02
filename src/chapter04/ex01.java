package chapter04;

public class ex01 {
    public static void main(String[] args){
        /*
        ++前后区别
         */
        int i = 1;
        i = i++;
        System.out.println(i);//1
        int j = 1;
        j = ++j;
        System.out.println(j);//2

        int k1 = 10;
        int k2 = 20;
        int k = k1++;
        System.out.println("k=" + k);//10
        System.out.println("k1=" + k1);//11
        k = --k2;
        System.out.println("k=" + k);//19
        System.out.println("k2" + k2);//19


    }
}
