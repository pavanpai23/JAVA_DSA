package ArrayList;
import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2,76);

        System.out.println(list);


        //get operation-O(1)
//        int element=list.get(2);
//        System.out.println(element);

        //Delete
//        list.remove(2);
//        System.out.println(list);

        //set element at index
//        list.set(2,30);
//        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(22));
    }
}
