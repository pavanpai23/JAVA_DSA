package Oops;

public class construters {
    public static void main(String[] args) {
   Student2 s1=new Student2();
        Student2 s2=new Student2("Pavan");
        Student2 s3=new Student2(123);
    }
}
   class Student2 {
    String name;
    int roll;

 Student2(){
     System.out.println("constructor is called..");
 }
 Student2(String name){
     this.name=name;
 }
 Student2(int roll){
     this.roll=roll;
 }
}
