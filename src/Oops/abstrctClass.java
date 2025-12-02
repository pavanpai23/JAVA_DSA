package Oops;

public class abstrctClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken ch=new Chicken();
        ch.eat();
        ch.walk();
    }
}

abstract class Animals{
    void eat(){
        System.out.println("animals eats");
    }

    abstract void walk();
}

class Horse extends Animals{
    void walk(){
        System.out.println("walk by 4 legs");
    }
}

class Chicken extends Animals{
    void walk(){
        System.out.println("Walks by 2 legs");
    }
}