package Oops;

public class inheritance {
    public static void main(String[] args) {
    Dog bobby=new Dog();
    bobby.eat();
    bobby.leg=4;
    System.out.println(bobby.leg);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathess");
    }
}

class mammals extends Animal{
  int leg;
}

class Dog extends mammals{
    String breed;
}

//derived class or subclass
//class Fish extends Animal{
//int Fins;
//
//void swim(){
//    System.out.println("animals can swim");
//}
//}
