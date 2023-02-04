package chapter07;

public class ChiTao {
    public static void main(String[] args){
        T t = new T();
        int peaches = t.getTao(10);
        System.out.println(peaches);
    }
}
class T {
    public int getTao(int day){
//        int i = 1;
        if (day > 1){
            return 2 * (getTao(day - 1) + 1);
        }else {
            return 1;
        }
    }
}