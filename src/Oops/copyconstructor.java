package Oops;

public class copyconstructor {
    public static void main(String[] args) {
        Student3 s1=new Student3();
        s1.name="pavan";
        s1.roll=5;
        s1.password="abcd";

        Student3 s2=new Student3();
          s2.password="xyz";
        }
}
class Student3 {
    String name;
    int roll;
    String password;

    Student3(Student3 s1){
      this.name=s1.name;
      this.roll=s1.roll;
    }

    Student3(){
        System.out.println("constructor is called..");
    }
    Student3(String name){
        this.name=name;
    }
    Student3(int roll){
        this.roll=roll;
    }
    }

