package chapter02;

public class hw04 {
    public static void main(String[] args){
        /*
         姓名 年龄 成绩 性别 爱好
         x    x    x   x   x
         要求：
         1）用变量将姓名、年龄、成绩、性别、爱好存储
         2）使用+
         3）添加适当的注释
         4）添加转义字符，使用一条语句输出
         */
        String a_name = "张三";
        int a_age = 23;
        double a_score = 92.3;
        char a_gender = '男';
        String a_hobby = "干饭";

        String b_name = "李四";
        int b_age = 20;
        double b_score = 95.8;
        char b_gender = '女';
        String b_hobby = "羽毛球";

        System.out.println("姓名\t年龄\t成绩\t\t性别\t爱好\n"
                +a_name +'\t'+a_age+'\t'+a_score+'\t'+a_gender+'\t'+ a_hobby +'\n'
                +b_name +'\t'+b_age+'\t'+b_score+'\t'+b_gender+'\t'+ b_hobby
        );
    }
}
