package chapter06;

public class YangHui {
    public static void main(String[] args){
        /*
        数组
         */
        int levels = 6;
        int[][] yanghui = new int[levels][];
        for (int level = 0; level < levels; level++){
            yanghui[level] = new int[level + 1];
            for (int i = 0; i < level + 1; i++) {
                if (i == 0 || i == level) {
                    yanghui[level][i] = 1;
                } else {
                    yanghui[level][i] = yanghui[level - 1][i - 1] + yanghui[level - 1][i];
                }
            }
        }
        for (int i =0; i < levels; i++){
            for (int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
