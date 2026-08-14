package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(3);

        System.out.println(list);
        Collections.sort(list);//assendeing
        System.out.println(list);

        //dexenfding
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
