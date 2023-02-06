package chapter08.ex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "======零钱通明细========";
        double money = 0;
        double balance = 0;
        String date = "";
        String key = "";
        boolean loop = true;

        do {
            System.out.println("\n======零钱通菜单========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("======================");
            System.out.print("请选择（1-4）：");
            key = myScanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = myScanner.nextInt();
                    if (money<=0){
                        System.out.print("收入为负数，退出");
                        loop = false;
                        break;
                    }
                    balance += money;
                    Date myGetDate = new Date();
                    details += "\n收益入账\t+" + money + "\t时间\t" + sdf.format(myGetDate) + "\t余额\t" + balance;
                    break;
                case "3":
                    System.out.print("此次消费说明：");
                    String costNote = myScanner.next();
                    System.out.print("此次消费金额：");
                    money = myScanner.nextDouble();
                    if (money<=0){
                        System.out.print("消费为负数，退出");
                        loop = false;
                        break;
                    }
                    if (balance-money<=0){
                        System.out.print("您的余额为："+ balance +"，余额不足，退出");
                        loop = false;
                        break;
                    }
                    balance += money;
                    Date myLoseDate = new Date();
                    details += "\n"+ costNote +"\t-" + money + "\t时间\t" + sdf.format(myLoseDate) + "\t余额\t" + balance;
                    break;
                case "4":
                    String myExitChoice;
                    while (true){
                        System.out.println("确定退出吗（y/n）：");
                        myExitChoice = myScanner.next();
                        if ("y".equals(myExitChoice) || "n".equals(myExitChoice)){
                            break;
                        }
                    }
                    if ("y".equals(myExitChoice)){
                        System.out.println("成功退出");
                        loop = false;
                    } else if ("n".equals(myExitChoice)) {
                        System.out.println("已返回");
                        System.out.println("请重新输入（1-4）：");
                    }
                    break;
                default:
                    System.out.println("输入错误，请重新输入：");
                    break;
            }

        }while (loop);
    }
}
class SmallChangeSysOop{
    Scanner myScanner = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String details = "======零钱通明细========";
    double money = 0;
    double balance = 0;
    String key = "";
    boolean loop = true;

    public void showMenu(){
        do {
            System.out.println("\n======零钱通菜单========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("======================");
            System.out.print("请选择（1-4）：");
            key = myScanner.next();
            switch (key){
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入错误，请重新输入：");
                    break;
            }

        }while (loop);
    }
    public void details(){
        System.out.println(details);
    }
    public void income(){
        System.out.print("收益入账金额：");
        money = myScanner.nextInt();
        if (money<=0){
            System.out.print("收入为负数，退出");
            loop = false;
            return;
        }
        balance += money;
        Date myGetDate = new Date();
        details += "\n收益入账\t+" + money + "\t时间\t" + sdf.format(myGetDate) + "\t余额\t" + balance;

    }
    public void pay(){
        System.out.print("此次消费说明：");
        String costNote = myScanner.next();
        System.out.print("此次消费金额：");
        money = myScanner.nextDouble();
        if (money<=0){
            System.out.print("消费为负数，退出");
            loop = false;
            return;
        }
        if (balance-money<=0){
            System.out.print("您的余额为："+ balance +"，余额不足，退出");
            loop = false;
            return;
        }
        balance += money;
        Date myLoseDate = new Date();
        details += "\n"+ costNote +"\t-" + money + "\t时间\t" + sdf.format(myLoseDate) + "\t余额\t" + balance;

    }
    public void exit(){
        String myExitChoice;
        while (true){
            System.out.println("确定退出吗（y/n）：");
            myExitChoice = myScanner.next();
            if ("y".equals(myExitChoice) || "n".equals(myExitChoice)){
                break;
            }
        }
        if ("y".equals(myExitChoice)){
            System.out.println("成功退出");
            loop = false;
        } else if ("n".equals(myExitChoice)) {
            System.out.println("已返回");
            System.out.println("请重新输入（1-4）：");
        }
    }
}
