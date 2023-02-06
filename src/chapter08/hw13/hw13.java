package chapter08.hw13;

public class hw13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Teacher("t1",'男',32,8);
        person[1] = new Teacher("t2",'女',35,10);
        person[2] = new Student("s1",'男',12,12111);
        person[3] = new Student("s2",'女',14,12112);
        Person tmp = null;
        for (int i = person.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (person[j].getAge() < person[j+1].getAge()){
                    tmp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
            method(person[i]);
        }

    }
    public static void method(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        }
    }
}
