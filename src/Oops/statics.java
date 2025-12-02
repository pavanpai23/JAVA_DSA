package Oops;

public class statics {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.schoolName="jmj";
        System.out.println(s1.schoolName);
    }
}

class Students{
    String name;
    int rollno;

    static String schoolName;

    void setName(){
        this.name=name;
    }

    String getname(){
        return this.name;
    }
}
