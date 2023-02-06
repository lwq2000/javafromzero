package chapter08.ex;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    public void feed(Animals animals, Food food){
        System.out.println("主人 "+ this.name + " 给 " + animals.getName() + " 喂 " + food.getName());
    };
//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人 "+ this.name + " 给 " + dog.getName() + " 喂 " + bone.getName());
//    };
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人 "+ this.name + " 给 " + cat.getName() + " 喂 " + fish.getName());
//    };
}
