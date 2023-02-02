package chapter06;

public class hw02 {
    public static void main(String[] args){
        /*
        随机生成10个整数（1-100）保存到数组，并倒序打印以及求平均值/求最大值和最大值的下标，
        并查找里面是否有8
         */
        int[] arr = new int[10];
        double avg = 0;
        int max = -1;
        int maxIndex = -1;
        boolean hasEight = false;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println("第"+i+"个元素为："+arr[i]);
            avg += arr[i];
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] == 8){
                hasEight = true;
            }
        }
        avg = avg / arr.length;
        System.out.println("平均值："+avg);
        System.out.println("最大值："+max);
        System.out.println("最大值下标："+maxIndex);
        if (hasEight){
            System.out.println("有8");
        }else {
            System.out.println("无8");
        }

    }
}
