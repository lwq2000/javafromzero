package chapter04;

public class ex09 {
    public static void main(String[] args){
        /*
        金字塔，三种
         */
        //first
//        int levels = 5;
//        int level = 1;
//        while (level<=levels){
//            int num = 1;
//            while (num <= level){
//                System.out.print("*");
//                num++;
//            }
//            System.out.println();
//            level++;
//        }
        //second
//        int levels = 5;
//        int level = 1;
//        while (level<=levels){
//            int num = 1;
//            while (num <= 2 * levels - 1){
//                if (num > (levels - level) && num <= (levels + level - 1)){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//                num++;
//            }
//            System.out.println();
//            level++;
//        }
        //third
        int levels = 5;
        int level = 1;
        while (level<=levels){
            int num = 1;
            while (num <= 2 * levels - 1){
                if (level < levels){
                    if (num == (levels - level + 1) || num == (levels + level - 1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    num++;
                } else {
                    System.out.print("*");
                    num++;
                }

            }
            System.out.println();
            level++;
        }
    }
}
