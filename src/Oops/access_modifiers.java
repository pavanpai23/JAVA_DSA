package Oops;

public class access_modifiers {
        public static void main(String[] args) {
            Pen p1=new Pen();
            p1.setcolor("Blue");
            System.out.println(p1.color);
            p1.settip(5);
            System.out.println(p1.tip);

            Bank myacc=new Bank();
            myacc.username="pavan";
            myacc.setPassword("asssjiusch");
        }
    }

    //bank account
   class Bank{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
    }

    class Pen1{
        String color;
        int tip;

        void setcolor(String newcolor){
            color=newcolor;
        }
        void settip(int newtip){
            tip=newtip;
        }
    }

    class Student1{
        char name;
        int age;
        float percentage;

        void calcpercentage(int phy, int chm, int maths) {
            percentage=(phy+chm+maths)/3;
        }
    }

