package chapter08.ex;

import chapter08.ex.Person;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("a",18,"1");
        person[1] = new Person("b",19,"2");
        person[2] = new Person("c",20,"3");
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i]);
        }
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j+1].getAge()){
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i]);
        }
    }
}
