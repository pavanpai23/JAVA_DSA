package Oops;

public class superKeyword {
    public static void main(String[] args) {
        Horses h=new Horses();

    }
}

class Anima{
    Anima(){
        System.out.println("animal consrtuctor is called");
    }
}

class Horses extends Anima{
    Horses(){
        super();
        System.out.println("horse constructor is called");
    }
}
