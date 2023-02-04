package chapter06;

public class bubble {
    public static void main(String[] args){
        /*
        冒泡排序，从小到大
         */
        int[] arr = {10, 23, 57, 100};
        int temp = 0;
        for ( int j = arr.length - 1; j > 0; j--){
//            System.out.println(j);
            int count = 0;
            for ( int i = 0; i < j; i++){
                temp = arr[i];
                if (arr[i] > arr[i + 1]){
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
            if (count == 0){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
