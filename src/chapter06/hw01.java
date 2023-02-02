package chapter06;

public class hw01 {
    public static void main(String[] args){
        /*
        已知有一个升序数组，要求插入一个元素，该数组顺序依然是升序，比如：
        [10，12，45，90] + 23 --->[10，12，23，45，90]
         */
        int[] upInt = {10, 12, 22, 24, 30, 45, 90, 100};
        int insert = 23;
        int[] upInt1 = new int[upInt.length + 1];
        int j = 0;
        for (int i = 0; i < upInt.length; i++){
            if ((upInt[i] > insert) && (i == j)){
                upInt1[j] = insert;
                upInt1[j + 1] = upInt[i];
                j++;
            }else {
                upInt1[j] = upInt[i];
            }
            j++;
        }
//        upInt = upInt1;
        for (int k = 0; k < upInt1.length; k++){
//            System.out.println(upInt[k]);
            System.out.println(upInt1[k]);
        }
    }
}
