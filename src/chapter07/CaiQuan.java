package chapter07;

import java.util.Random;
import java.util.Scanner;

public class CaiQuan {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int tomWin = 0;
        int tomTotal = 0;
        System.out.println("猜拳开始：");
        System.out.println("请输入0（石头），1（剪刀），2（布），3（退出）：");
        int i = myScanner.nextInt();
        int computer = myRandom.nextInt(3);
        while (i != 3){
            while ( (i != 0) && (i !=1) && (i != 2)){
                System.out.println("输入错误，请重新输入：");
                i = myScanner.nextInt();
            }
            System.out.println("第"+ (tomTotal+1) +"轮：");
            System.out.println("你出的是："+i+"，电脑出的是："+computer);
            if ((i==0&&computer==1) || (i==1&&computer==2) || (i==2&&computer==0)){
                tomWin += 1;
                tomTotal +=1;
                System.out.println("该局结束，目前总共"+tomTotal+"局，你赢了"+tomWin+"局。");
            } else if ((i==1&&computer==0) || (i==2&&computer==1) || (i==0&&computer==2)) {
                tomTotal+=1;
                System.out.println("该局结束，目前总共"+tomTotal+"局，你赢了"+tomWin+"局。");
            }else {
                System.out.println("没有胜负，该局继续：");
            }
            System.out.println("请输入0（石头），1（剪刀），2（布），3（退出）：");
            i = myScanner.nextInt();
            computer = myRandom.nextInt(3);
        }
        System.out.println("猜拳结束。目前总共"+tomTotal+"局，你赢了"+tomWin+"局。");
    }

}
