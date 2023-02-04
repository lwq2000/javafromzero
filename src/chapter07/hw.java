package chapter07;

public class hw {
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius = 1;
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());
        System.out.println();
    }
}
class A01{
    public double max(double ... nums){
        double m = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > m){
                m = nums[i];
            }
        }
        return m;
    }
}

class A02{
    public int find(String str, String ... strs){
        int index = -1;
        for (int i = 0; i < strs.length; i++){
            if (str.equals(strs[i])){
                index = i;
                break;
            }
        }
        return index;
    }
}

class Book{
    public double updatePrice(double price){
        if (price > 150){
            price = 150;
        }else if(price > 100){
            price = 100;
        }
        return price;
//        return price > 150 ? 150: (price > 100 ? 100: price);
    }
}

class A03{
    public double[] copyArr(double[] arr){
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public int[] copyArr(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public String[] copyArr(String[] arr){
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public boolean[] copyArr(boolean[] arr){
        boolean[] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
}

class Circle{
    double radius;
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}

class Cale{
    public double add(double x, double y){
        return x + y;
    }
    public double minus(double x, double y){
        return x - y;
    }
    public double mul(double x, double y){
        return x * y;
    }
    public double divide(double x, double y){
        if ((y-0) < 1e-5){
            System.out.println("除数为0，错误");
            return -1;
        }
        return x / y;
    }
}

class Dog{
    String name;
    String color;
    int age;
    public void show(){
        System.out.println("狗狗的名字："+this.name);
        System.out.println("狗狗的颜色："+this.color);
        System.out.println("狗狗的年龄："+this.age);
    }
}

class Employee {
    String name;
    String gender;
    int age;
    String title;
    double salary;
    public Employee(String name,String gender, int age, String title, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.title = title;
        this.salary = salary;
    }
    public Employee(String name,String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Employee(String title, double salary){
        this.title = title;
        this.salary = salary;
    }
    public double method(double a, double b){
        return a + b;
    }
    public double method(double a, int b){
        return a + b;
    }
}