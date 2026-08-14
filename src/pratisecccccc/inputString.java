package pratisecccccc;
import java.util.Scanner;
public class inputString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//  input name
//        String name;
//        name =sc.nextLine();
//        System.out.println(name);

        //length
//        String name="Pavan a pai";
//        System.out.println(name.length());

        //concatination
        String name1="pavan";
        String name2="pai";

        String fullname=name1+" "+name2;
        System.out.println(fullname);
//        System.out.println(name1.concat( name2));

        System.out.println(fullname.charAt(0));
    }
}
