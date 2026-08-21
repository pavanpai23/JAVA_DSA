package pratisecccccc.Arrays;
import java.util.*;
public class print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String name[]=new String[num];
        for (int i = 0; i <name.length ; i++) {
            name[i]=sc.next();
        }

        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]);
        }
    }

}
