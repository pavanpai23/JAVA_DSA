package Oops;

public class Getters_Setters {
    public static void main(String[] args) {
        Pen p2 = new Pen();
        p2.setcolor("Blue");
        System.out.println(p2.color);
        p2.settip(5);
        System.out.println(p2.tip);
    }
}
    class Pen2{
        private String color;
        private int tip;

        //Getters
        String getcolor(){
            return this.color;
        }
        int gettip(){
            return this.tip;
        }

        //Seters
        void setcolor(String newcolor){
            this.color=newcolor;
        }
        void settip(int newtip){
            this.tip=tip;
        }
    }

